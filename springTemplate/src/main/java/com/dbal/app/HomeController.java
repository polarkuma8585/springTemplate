package com.dbal.app;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dbal.app.dumy.DumyService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	DumyService service ;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("serverTime", service.getTime() );
		
		return "home";
	}
	
	@RequestMapping(value = "/homeEmpty", method = RequestMethod.GET)
	public String homeempty(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
			
		model.addAttribute("serverTime", service.getTime() );
		
		return "home.empty";
	}
	
	@RequestMapping("/ajaxTest.do")	 
	public @ResponseBody List<String> test(){
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("을지문덕");
		return list;
	}
}
