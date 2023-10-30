package com.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.bean.User;
import com.service.UserService;
@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping(value = "storeUser",method = RequestMethod.POST)
	public ModelAndView storeUser(HttpServletRequest req, User user) {
	int uid = Integer.parseInt(req.getParameter("uid"));
	String fname = req.getParameter("fname"); 
	String lname = req.getParameter("lname");
	String email = req.getParameter("email");
	user.setUid(uid);
	user.setFname(fname);
	user.setLname(lname);
	user.setEmail(email);
	String result = userService.storeUser(user);
	ModelAndView mav = new ModelAndView();
	mav.addObject("msg", result);
	mav.setViewName("storeUser.jsp");
	return mav;
	}
	@RequestMapping(value = "updateUser",method = RequestMethod.POST)
	public ModelAndView updateUser(HttpServletRequest req, User user) {
	int uid = Integer.parseInt(req.getParameter("uid"));
	String email = req.getParameter("email");
	user.setUid(uid);
	user.setEmail(email);
	String result = userService.updateUser(user);
	ModelAndView mav = new ModelAndView();
	mav.addObject("msg", result);
	mav.setViewName("updateUser.jsp");
	return mav;
	}
	@RequestMapping(value = "searchUser",method = RequestMethod.POST)
	public ModelAndView searchUser(HttpServletRequest req) {
	int uid = Integer.parseInt(req.getParameter("uid"));
	String result = userService.searchUserById(uid);
	ModelAndView mav = new ModelAndView();
	mav.addObject("msg", result);
	mav.setViewName("searchUserById.jsp");
	return mav;
	}


}
