package com.app.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.StudentDAO;

public class StudentReadController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		StudentDAO studentDAO = new StudentDAO();
		
		Long id = Long.parseLong(req.getParameter("id"));
		
//		StudentDTO 객체를 student라는 이름으로 JSP로 전달
//		DAO에서 DTO를 리턴
		req.setAttribute("student", studentDAO.select(id).orElseThrow(() -> {
			throw new RuntimeException("user not found");
		}));
		
		result.setPath("read.jsp");
		return result;
	}

}
