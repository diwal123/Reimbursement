package com.controller;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import com.dao.DaoUserTmpl;
import com.users.Employees;

public class RegisterController {
	
	
	public static String Register(HttpServletRequest request) throws IOException {
			
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("secondName");
		String email = request.getParameter("email");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String status = request.getParameter("role");
		System.out.println(status);
		int userStatus=0;
		if(status.equals("FinanceManager")) {
			userStatus=1;
		}else {
			userStatus=2;
		}
		
		DaoUserTmpl daoUser = new DaoUserTmpl();
		Employees employee = new Employees(firstName, lastName, userName, password, email, 0, userStatus ); 
		
		daoUser.addUsers(employee);
			

		return "/main.html";
		
		
		
	}

}
