package com.tledu.qs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tledu.qs.manager.DataProcessManager;

public class SystemController {
	public static void main(String[] args) {
		// 1500 ~ 1600 之间
		if (args == null  || args.length == 0) {
			System.err.println("传入参数不正确,请传入要查询的IP地址!!");
			System.exit(-1);
		}
		String adidIP = args[0];
		long startMS = System.currentTimeMillis();
		String location = DataProcessManager.getLocation(adidIP);
		long endMS = System.currentTimeMillis();
		System.out.println(location);
		System.out.println(endMS - startMS);
	}
	@RequestMapping("/ipsearch")
	public String ipSearch() {
		
		return "ip";
	}
	@RequestMapping(value="/ipsearch",method=RequestMethod.POST)
	@ResponseBody
	public String ipSearch(HttpServletRequest request,Model model){
		
	String	ip = request.getParameter("ip");
	System.out.println(ip);
	
		String location = DataProcessManager.getLocation(ip);
		System.out.println(location);
		model.addAttribute("location", location);
		return location;
				
	}
	
}
