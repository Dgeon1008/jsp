package com.app.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.StudentDAO;
import com.app.vo.StudentVO;

public class StudentEditOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		StudentDAO studentDAO = new StudentDAO();
		StudentVO studentVO = new StudentVO();
		
		studentVO.setId(Long.parseLong(req.getParameter("id")));
		studentVO.setStudentName(req.getParameter("studentName"));
		studentVO.setStudentMath(Integer.parseInt(req.getParameter("studentMath")));
		studentVO.setStudentEng(Integer.parseInt(req.getParameter("studentEng")));
		studentVO.setStudentKor(Integer.parseInt(req.getParameter("studentKor")));
		
		result.setRedirect(true);
		result.setPath("list.student");
		studentDAO.update(studentVO);
		
		return result;
	}

}
