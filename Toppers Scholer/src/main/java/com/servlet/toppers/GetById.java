package com.servlet.toppers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.topper.Toppers;
import com.service.topper.TopperService;

public class GetById extends HttpServlet {
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		System.out.println("get by id");
		int getbyid=Integer.parseInt(req.getParameter("id"));
		TopperService ts=new TopperService();
		Toppers r=ts.getByID(getbyid);
		req.setAttribute("getid", r);
		req.getRequestDispatcher("GetByidRes.jsp").forward(req, res);
	}

}
