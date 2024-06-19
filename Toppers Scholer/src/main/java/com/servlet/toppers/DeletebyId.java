package com.servlet.toppers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.topper.TopperService;

public class DeletebyId extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	System.out.println("delete");
	int deleteid=Integer.parseInt(req.getParameter("id"));
	TopperService ts=new TopperService();
	String r=ts.deleteById(deleteid);
	req.setAttribute("del", r);
	req.getRequestDispatcher("DeleteRes.jsp").forward(req, res);
	}
}
