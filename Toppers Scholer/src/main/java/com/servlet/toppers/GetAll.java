package com.servlet.toppers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.topper.Toppers;
import com.service.topper.TopperService;

public class GetAll extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		System.out.println("hello");
		TopperService ts=new TopperService();
		List<Toppers> acc=new ArrayList<Toppers>();
		acc=ts.getAllDa();
		req.setAttribute("get", acc);
		req.getRequestDispatcher("GetAllRes.jsp").forward(req, res);
	}

}
