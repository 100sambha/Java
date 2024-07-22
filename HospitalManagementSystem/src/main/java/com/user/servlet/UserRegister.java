package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.DbConnect;
import com.entity.User;

@WebServlet("/user_register")
public class UserRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String fullName = req.getParameter("fullname");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			User u = new User(fullName, email, password);
			
			UserDao userDao = new UserDao(DbConnect.getConnection());
			
			boolean f = userDao.userRegister(u);
			
			HttpSession httpSession = req.getSession();
			
			if(f) {
				System.out.println("Successfully Register");
				
				httpSession.setAttribute("succMsg", "Successfully Register");
				resp.sendRedirect("user_page.jsp");
			}else {
				httpSession.setAttribute("errMsg", "Failed To Register");
				resp.sendRedirect("signup.jsp");
				System.out.println("Failed To Register");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}