package com.namee.nonos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.namee.nonos.service.OrderService;

@Controller
public class OrderController {

	private Logger logger = LoggerFactory.getLogger(OrderController.class);
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value="/orderList", method=RequestMethod.GET)
	public String getOrderList(Model model) {
		logger.debug("orderList: "+orderService.getOrderList().toString());
		model.addAttribute("orderList", orderService.getOrderList());
		return "order/orderList";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(Model model) {
		logger.debug("homePage: "+model.toString());
        model.addAttribute("greeting", "Hi, Welcome to mysite");
        return "welcome";
    }
// 
//    @RequestMapping(value = "/admin", method = RequestMethod.GET)
//    public String adminPage(Model model) {
//        model.addAttribute("user", getPrincipal());
//        return "admin";
//    }
//     
//    @RequestMapping(value = "/db", method = RequestMethod.GET)
//    public String dbaPage(Model model) {
//        model.addAttribute("user", getPrincipal());
//        return "dba";
//    }
// 
//    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
//    public String accessDeniedPage(Model model) {
//        model.addAttribute("user", getPrincipal());
//        return "accessDenied";
//    }
// 
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String loginPage() {
//    	logger.debug("login: ajljk");
//        return "login";
//    }
// 
//    @RequestMapping(value="/logout", method = RequestMethod.GET)
//    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth != null){    
//            new SecurityContextLogoutHandler().logout(request, response, auth);
//        }
//        return "redirect:/login?logout";
//    }
// 
//    private String getPrincipal(){
//        String userName = null;
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
// 
//        if (principal instanceof UserDetails) {
//            userName = ((UserDetails)principal).getUsername();
//        } else {
//            userName = principal.toString();
//        }
//        return userName;
//    }
}
