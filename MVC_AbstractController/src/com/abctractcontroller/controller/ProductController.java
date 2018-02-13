package com.abctractcontroller.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.abstractcontroller.dao.ProductDao;

public class ProductController extends AbstractController {
	private ProductDao dao;
	
	public ProductDao getDao() {
		return dao;
	}

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(dao.getProducts());
		ModelAndView mav=new ModelAndView("products");
		mav.addObject("products", dao.getProducts());
		return mav;
	}

}
