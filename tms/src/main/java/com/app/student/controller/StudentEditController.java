package com.app.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.StudentDAO;

public class StudentEditController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		StudentDAO studentDAO = new StudentDAO();
		
		Long id = Long.parseLong(req.getParameter("id"));
		req.setAttribute("student", studentDAO.select(id).orElseThrow(() -> {
			throw new RuntimeException("StudentEditController user not Found");
		}));
		
		result.setPath("edit.jsp");
		return result;
	}

}
