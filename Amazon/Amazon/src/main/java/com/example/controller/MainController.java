package com.example.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Device;
import com.example.model.Devices;

@Controller
public class MainController {
	@RequestMapping("/home")
	public String home() {
		return "home.html";
	}
	
	@RequestMapping("/blackberry")
	public ModelAndView blackberry() {
		ModelAndView mv=new ModelAndView("blackberry");
		Device d1=new Device(1,"Black-1","Smart Phone");
		
		ArrayList<Device> myList=new ArrayList();
		myList.add(d1);
		
		Devices deviceList=new Devices(myList,"blackberry");
		mv.addObject("blackberry", deviceList);
		return mv;
	}
//	
//	@RequestMapping("/apple")
//	public String apple() {
//		return "apple.html";
//	}
//	
	
	
	@RequestMapping("/apple")
	public ModelAndView apple() {
		ModelAndView mv=new ModelAndView("apple");
		Device d1=new Device(1,"Black-1","Smart Phone");
		
		ArrayList<Device> myList=new ArrayList();
		myList.add(d1);
		
		Devices deviceList=new Devices(myList,"apple");
		mv.addObject("apple", deviceList);
		return mv;
	}
	
	
}
