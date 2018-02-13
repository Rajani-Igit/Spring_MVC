package com.app.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.app.controllers.BookTikitController;

public class TicketIntercepter extends HandlerInterceptorAdapter {
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
	// TODO Auto-generated method stub
	//return super.preHandle(request, response, handler);
	System.out.println("Inside pre handling...");
	//System.out.println(handler instance of  );
	if(handler instanceof BookTikitController){
		System.out.println("Exexuting for BookTikit controller");
	}
	return true;
}
}
