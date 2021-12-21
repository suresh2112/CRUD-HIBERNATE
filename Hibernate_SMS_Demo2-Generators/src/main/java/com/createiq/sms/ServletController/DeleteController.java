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
 * Servlet implementation class DeleteController
 */
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid=Integer.parseInt(request.getParameter("sid"));
//		StudentServiceimpl serviceimpl=new StudentService();
		StudentSerive serive=new StudentServiceImpl();
		
		serive.delete(sid);
		request.getRequestDispatcher("./find").forward(request, response);
		
		
	}

	

}
