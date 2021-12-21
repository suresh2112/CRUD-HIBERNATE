package com.createiq.sms.ServletController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.sms.model.Student;
import com.createiq.sms.service.StudentSerive;
import com.createiq.sms.service.StudentServiceImpl;


/**
 * Servlet implementation class FindAllController
 */
public class FindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAllController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		StudentServiceimpl serviceimpl=new StudentService();
		StudentSerive serviceimpl=new StudentServiceImpl();
		List<Student> students=serviceimpl.findall();
		request.setAttribute("students", students);
		request.getRequestDispatcher("FindAll.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
