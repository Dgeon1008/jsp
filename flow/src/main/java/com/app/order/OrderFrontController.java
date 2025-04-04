package com.app.order;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.order.controller.OrderCancelController;
import com.app.order.controller.OrderListController;
import com.app.order.controller.OrderWriteOkController;
import com.app.product.controller.ProductDeleteController;
import com.app.product.controller.ProductListController;
import com.app.product.controller.ProductReadController;
import com.app.product.controller.ProductUpdateController;
import com.app.product.controller.ProductUpdateOkController;
import com.app.product.controller.ProductWriteController;
import com.app.product.controller.ProductWriteOkController;

public class OrderFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8;");
		
//		http://localhost9000/mvc/insert.product
//		/mvc/insert.product
//		빈 문자열로 치환
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		Result result = null;
		
		
		if(target.equals("write-ok")) {
//			코드의 강제성이 필요하다 interface
//			result 에 포워드인지 리다이렉트인지 담아준다.
			result = new OrderWriteOkController().execute(req, resp);
		}else if(target.equals("list")){
			result = new OrderListController().execute(req, resp);
		}else if(target.equals("cancel")){
			result = new OrderCancelController().execute(req, resp);
		}else {
//			전부 404
		}
		
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}











