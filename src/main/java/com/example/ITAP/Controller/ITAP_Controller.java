package com.example.ITAP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ITAP.Service.Drservice;

@Controller
public class ITAP_Controller {
	@Autowired
	private final Drservice drserv;
	public ITAP_Controller(Drservice drserv)
	{
		this.drserv = drserv;
	}
	
	@RequestMapping("/reqhome")
	public String intro1()
	{
		return "ReqHomePage";
	}
//	@RequestMapping("/drr")
//	public String drr()
//	{
//		return "NewApplication";
//	}
	@GetMapping("/drr")
	public String intro(Model m1)
	{
		List<String> appnamelist = drserv.getallappnames();
		m1.addAttribute("appnamelist",appnamelist); 
		return "NewApplication";
	}
	@GetMapping("/getappdeveloper")
	@ResponseBody
	public String getAppDeveloperByAppName(@RequestParam ("appname") String appname )
	{
		return drserv.getappdeveloper2(appname);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/ma")
	public String ma()
	{
		return "Maintenance_activity_form";
	}
	@RequestMapping("/rechome")
	public String recommender_homepage()
	{
		return "RecHomePage";
	}
	@RequestMapping("/apphome")
	public String approver_homepage()
	{
		return "ApproverHomePage";
	}
	@RequestMapping("/random")
	public String random()
	{
		return "random";
	}
}
