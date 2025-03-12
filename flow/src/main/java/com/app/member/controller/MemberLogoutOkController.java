package com.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.Action;
import com.app.Result;

public class MemberLogoutOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		HttpSession session = req.getSession();
		
//		세션영역을 비워준다.
//		session.removeAttribute("memberEmail");
//		모두 날린다.
		session.invalidate();
		
		result.setRedirect(true);
		result.setPath("login.member");
		return result;
	}

}
