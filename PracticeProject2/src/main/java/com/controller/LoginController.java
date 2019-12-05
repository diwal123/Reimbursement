package com.controller;

import javax.servlet.http.HttpServletRequest;

import com.dao.DaoUserTmpl;
import com.users.Employees;


public class LoginController {
	
	
	
	public static String Login(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		DaoUserTmpl daoUser = new DaoUserTmpl();
		Employees employee= new Employees();
		 employee = daoUser.selectUserByName(name);
		
		
		 if(name.equals(employee.getUserName()) && password.equals(employee.getPassword())) {
				//we are setting the session to the current logged in pet
				request.getSession().setAttribute("Employees", employee);
				return "/EmployeePortal.html";
			}
			
			return "/EmployeePortal.html";
		
		
		
		
		
		
	}

}
