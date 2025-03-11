package com.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.MemberDAO;
import com.app.vo.MemberVO;

public class MemberJoinOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
//		메서드 집합
		MemberDAO memberDAO = new MemberDAO();
//		담을 수 있는 그릇 VO 클래스
		MemberVO memberVO = new MemberVO();
		
		memberVO.setMemberEmail(req.getParameter("memberEmail"));
		memberVO.setMemberPassword(req.getParameter("memberPassword"));
		memberVO.setMemberName(req.getParameter("memberName"));

//		db insert
		memberDAO.insert(memberVO);
		
		result.setRedirect(true);
		result.setPath("login.member");
		return null;
	}

}
