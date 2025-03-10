package com.app.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.post.controller.PostDeleteController;
import com.app.post.controller.PostListController;
import com.app.post.controller.PostReadController;
import com.app.post.controller.PostUpdateController;
import com.app.post.controller.PostUpdateOkController;
import com.app.post.controller.PostWriteController;
import com.app.post.controller.PostWriteOkController;

public class PostFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      req.setCharacterEncoding("UTF-8");
	      resp.setContentType("text/html; charset=utf-8;");
		
//		http://localhost9000/mvc/insert.product
//		/mvc/insert.product
//		빈 문자열로 치환
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		Result result = null;
		
		
		if(target.equals("write")) {
//			코드의 강제성이 필요하다 interface
//			result 에 포워드인지 리다이렉트인지 담아준다.
			result = new PostWriteController().excute(req,resp);
		}else if(target.equals("write-ok")){
			result = new PostWriteOkController().excute(req,resp);
		}else if(target.equals("list")){
			result = new PostListController().excute(req, resp);	
		}else if(target.equals("read")){
			result = new PostReadController().excute(req, resp);
		}else if(target.equals("update")){
			result = new PostUpdateController().excute(req, resp);
		}else if(target.equals("update-ok")){
			result = new PostUpdateOkController().excute(req, resp);
		}else if(target.equals("delete-ok")){
			result = new PostDeleteController().excute(req, resp);
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











