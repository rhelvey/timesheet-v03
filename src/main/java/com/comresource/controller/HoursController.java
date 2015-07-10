package com.comresource.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comresource.model.Activity;
import com.comresource.model.WorkType;
import com.comresource.service.WorkTypeService;


@Controller
public class HoursController {

	@Autowired
	private WorkTypeService workTypeService;
	
	@RequestMapping(value = "/addHours",  method = RequestMethod.GET)
	public String getHours(@ModelAttribute ("workType") WorkType workType) {
	
		return "addHours";
	}
	
	@RequestMapping(value = "/addHours",  method = RequestMethod.POST)
	public String addHours(@Valid @ModelAttribute ("workType") WorkType workType, HttpSession session, BindingResult result) {
		
		System.out.println("exercise: " + workType.getHours());
		System.out.println("exercise activity: " + workType.getActivity());
		
		if(result.hasErrors()){
			return "addHours";
		}
		else{
			workTypeService.save(workType);
		}
		return "addHours";
	}
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		return workTypeService.findAllActivities();
	}
	
}
