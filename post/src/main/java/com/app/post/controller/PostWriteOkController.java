package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.vo.PostVO;

public class PostWriteOkController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		PostDAO postDAO = new PostDAO();
		PostVO postVO = new PostVO();
		
		postVO.setPostTitle(req.getParameter("postTitle"));
		postVO.setPostContent(req.getParameter("postContent"));
		
		System.out.println(postVO);
		
//		트래잭션
		postDAO.insert(postVO);
		Long insertedId = postDAO.selectId();
		
//		리다이렉트 후 포워드
		result.setRedirect(true);
		result.setPath(req.getContextPath() + "/read.post?id=" + insertedId);
		return result;
	}

}
