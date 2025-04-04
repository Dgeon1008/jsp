package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.ProductDAO;

public class ProductDeleteController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		ProductDAO productDAO = new ProductDAO();
		
		Long id = Long.parseLong(req.getParameter("id"));
		productDAO.delete(id);
		
//		redirect일때 써준다.
		result.setRedirect(true);
		result.setPath("list.product");
		return result;
	}

}
