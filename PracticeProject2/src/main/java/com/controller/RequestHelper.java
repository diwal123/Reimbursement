package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RequestHelper {
	
	public static String process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		switch(request.getRequestURI()) {
		
		case "/PracticeProject2/Login.do":
			return LoginController.Login(request);
			
		case "/PracticeProject2/Register.do":
			return RegisterController.Register(request);
			
		case "/PracticeProject2/Home.do":
			//return HomeController.Home(request, response);
			
		default:
			return "/index.html";
		}
	}


}
