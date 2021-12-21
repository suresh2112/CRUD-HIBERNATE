package com.createiq.sms.ServletController;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.sms.model.Student;
import com.createiq.sms.service.StudentSerive;
import com.createiq.sms.service.StudentServiceImpl;


/**
 * Servlet implementation class UpdateController
 */
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid=Integer.parseInt(request.getParameter("sid"));
////		StudentServiceimpl serviceimpl=new StudentService();
//		StudentServiceImpl serviceImpl=new StudentServiceImpl();
//		Student student=serviceimpl.findbyid(sid);
		StudentSerive  serviceImpl=new StudentServiceImpl();
		Student student=serviceImpl.findbyid(sid);
		
		request.setAttribute("student", student);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid=Integer.parseInt(request.getParameter("sid"));
		String sname=request.getParameter("sname");
		double sfee=Double.parseDouble(request.getParameter("sfee"));
		StudentSerive serviceimpl=new StudentServiceImpl();
		Student student=new Student(sid, sname, sfee);
		serviceimpl.update(student);
		request.getRequestDispatcher("./find").forward(request, response);
		
	}

}
