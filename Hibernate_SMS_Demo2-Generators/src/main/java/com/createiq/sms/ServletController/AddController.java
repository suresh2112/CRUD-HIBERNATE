package com.createiq.sms.ServletController;

import java.io.IOException;

//import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.sms.model.Student;
import com.createiq.sms.service.StudentSerive;
import com.createiq.sms.service.StudentServiceImpl;

/**
 * Servlet implementation class AddController
 */
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("addStudent.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid=Integer.parseInt(request.getParameter("sid"));
		String sname=request.getParameter("sname");
		double sfee=Double.parseDouble(request.getParameter("sfee"));
		Student student=new Student(sid, sname, sfee);
		StudentSerive serviceimpl=new StudentServiceImpl();
		serviceimpl.insert(student);
		request.getRequestDispatcher("./find").forward(request, response);
				
				
	}

}
