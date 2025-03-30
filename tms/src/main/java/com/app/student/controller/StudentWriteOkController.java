package com.app.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.StudentDAO;
import com.app.vo.StudentVO;

public class StudentWriteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		StudentDAO studentDAO = new StudentDAO();
		StudentVO studentVO = new StudentVO();
		
		studentVO.setStudentName(req.getParameter("studentName"));
		studentVO.setStudentEng(Integer.parseInt(req.getParameter("studentEng")));
		studentVO.setStudentKor(Integer.parseInt(req.getParameter("studentKor")));
		studentVO.setStudentMath(Integer.parseInt(req.getParameter("studentMath")));
		
		studentDAO.insert(studentVO);
		
		result.setRedirect(true);
		result.setPath(req.getContextPath() + "/list.student");
		
		return result;
	}

}
