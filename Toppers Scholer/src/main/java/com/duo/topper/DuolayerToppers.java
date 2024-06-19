package com.duo.topper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.topper.Toppers;

public class DuolayerToppers {
	String username="root";
	String pwd="Raju@123";
	String url="jdbc:mysql://localhost:3306/toppers"; 
	String inqry="insert into toppers_students(name,education,course,course_fee)values(?,?,?,?)";
	String getqry="select * from toppers_students";
	String upqry="update toppers_students set name=?,education=?,course=?,course_fee=? where id=? ";
	String delqry="delete from toppers_students where id=?";
	String getidqry="select * from toppers_students where id=?";
	public String creatTop(Toppers abc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn=DriverManager.getConnection(url,username,pwd);
			PreparedStatement pr=conn.prepareStatement(inqry);
			pr.setString(1, abc.getName());
			pr.setString(2, abc.getEducation());
			pr.setString(3, abc.getCourse());
			pr.setInt(4, abc.getCourse_fee());
			int result=pr.executeUpdate();
			conn.close();
			pr.close();
			if(result>0);
			return "successfully created";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "something went wrong";
		
	}
	public List<Toppers> getAlldata(){
		List<Toppers> acc=new ArrayList<Toppers>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn=DriverManager.getConnection(url,username,pwd);
			PreparedStatement pr=conn.prepareStatement(getqry);
			ResultSet res=pr.executeQuery();
			while(res.next()) {
				int id=res.getInt("id");
				String name=res.getString("name");
				String education=res.getString("education");
				String course=res.getString("course");
				int course_fee=res.getInt("course_fee");
				Toppers abc=new Toppers(id,name,education,course,course_fee);
				acc.add(abc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return acc;
	}
	public String updateDat(Toppers abc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn=DriverManager.getConnection(url,username,pwd);
			PreparedStatement pr=conn.prepareStatement(upqry);
			pr.setString(1,abc.getName());
			pr.setString(2, abc.getEducation());
			pr.setString(3, abc.getCourse());
			pr.setInt(4, abc.getCourse_fee());
			pr.setInt(5, abc.getId());
			int res=pr.executeUpdate();
			if(res>0) {
				return "updated sucessfully";
			}
			conn.close();
			pr.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "something went wrong";
	}
	public String deleteId(int deleteid) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn=DriverManager.getConnection(url,username,pwd);
			PreparedStatement pr=conn.prepareStatement(delqry);
			pr.setInt(1, deleteid);
			int ress=pr.executeUpdate();
			if(ress>0) {
				return "Deleted Sucessfully";
			}
			conn.close();
			pr.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "something went wrong";
	}
	public Toppers getid(int getbyid) {
		Toppers aa=new Toppers();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn=DriverManager.getConnection(url,username,pwd);
			PreparedStatement pr=conn.prepareStatement(getidqry);
			pr.setInt(1, getbyid);
			ResultSet rese=pr.executeQuery();
			while(rese.next()) {
				aa.setId(rese.getInt("id"));
				aa.setName(rese.getString("name"));
				aa.setEducation(rese.getString("education"));
				aa.setCourse(rese.getString("course"));
				aa.setCourse_fee(rese.getInt("course_fee"));
			}
			conn.close();
			pr.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aa;
	}
}
