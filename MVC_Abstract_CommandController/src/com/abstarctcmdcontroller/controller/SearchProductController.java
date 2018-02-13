package com.abstarctcmdcontroller.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

public class SearchProductController extends AbstractCommandController {

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object Command, BindException errors)
			throws Exception {
		ModelAndView mav=new ModelAndView("success");
		List<ProductBo> products=new ArrayList<ProductBo>();
		ProductBo bo=new ProductBo();
		bo.setProduct_id(1);
		bo.setProduct_brand("Honda");
		bo.setProduct_category("4 Wheelers");
		bo.setProduct_name("Honda City");
		
		ProductBo bo1=new ProductBo();
		bo1.setProduct_id(2);
		bo1.setProduct_brand("");
		bo1.setProduct_category("4 Wheelers");
		bo1.setProduct_name("Swift Dezire");
		products.add(bo1);
		
		ProductBo bo2=new ProductBo();
		bo2.setProduct_id(3);
		bo2.setProduct_brand("Maruti");
		bo2.setProduct_category("4 Wheelers");
		bo2.setProduct_name("ciaz");
		products.add(bo2);
		mav.addObject("products",products);
		
		return mav;
	}

}
