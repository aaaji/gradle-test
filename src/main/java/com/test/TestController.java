package com.test;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jhan
 *
 */
@Controller
public class TestController {

	
	@RequestMapping("/home")
	public String home(HttpServletRequest request) {
		printSession(request);
		return "home";
	}
	
	@RequestMapping("/member")
	public String member(HttpServletRequest request) {
		printSession(request);
		return "member";
	}
	
	public void printSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Enumeration enumeration =  session.getAttributeNames();
		while(enumeration.hasMoreElements()) {
			String key = (String) enumeration.nextElement();
			System.out.println(key+":"+session.getAttribute(key));
		}
	}
}
