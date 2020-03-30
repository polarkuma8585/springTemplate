package com.dbal.app.user.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbal.app.user.UserService;
import com.dbal.app.user.UserVO;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("getUser.do")
	public String getUser(UserVO vo, Model model) {
		model.addAttribute("user",  userService.getUser(vo));
		return "users/getUser"; //포워드
	}
	
	@RequestMapping("getUserList.do")
	public String getUserList(Model model, UserVO vo) {
		model.addAttribute("userList", 
				             userService.getUserList(vo));
		return "users/getUserList";
	}
	
	@RequestMapping("getUserListMap.do")
	public String getUserListMap(Model model, UserVO vo) {
		model.addAttribute("userList", 
				             userService.getUserListMap(vo));
		return "users/getUserList";
	}	
}
