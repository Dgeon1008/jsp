package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;

public class PostDeleteController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		PostDAO postDAO = new PostDAO();
		
		Long id = Long.parseLong(req.getParameter("id"));
		postDAO.delete(id);
		
//		redirect일때 써준다.
		result.setRedirect(true);
		result.setPath("list.post");
		return result;
	}
}
