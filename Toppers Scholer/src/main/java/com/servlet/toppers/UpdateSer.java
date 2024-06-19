package com.servlet.toppers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.topper.Toppers;
import com.service.topper.TopperService;

public class UpdateSer extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		System.out.println("java");
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String education=req.getParameter("education");
		String course=req.getParameter("course");
		int course_fee=Integer.parseInt(req.getParameter("course_fee"));
		Toppers abc=new Toppers();
		abc.setId(id);
		abc.setName(name);
		abc.setEducation(education);
		abc.setCourse(course);
		abc.setCourse_fee(course_fee);
		TopperService ts=new TopperService();
		String r=ts.updateData(abc);
		req.setAttribute("up", r);
		req.getRequestDispatcher("updateRes.jsp").forward(req, res);
}
}
