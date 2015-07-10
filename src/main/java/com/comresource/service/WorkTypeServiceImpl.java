package com.comresource.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comresource.model.Activity;
import com.comresource.model.WorkType;
import com.comresource.repository.WorkTypeRepository;


@Service("workTypeService")
public class WorkTypeServiceImpl implements WorkTypeService {
	
	
	@Autowired
	private WorkTypeRepository workTypeRepository;
	
	
	public List<Activity> findAllActivities() {
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity admin = new Activity();
		admin.setDesc("Admin");
		activities.add(admin);
		
		Activity consultant = new Activity();
		consultant.setDesc("Consultant");
		activities.add(consultant);
		
		Activity hr = new Activity();
		hr.setDesc("Human Resource");
		activities.add(hr);
		
		return activities;
	}
	
	@Transactional
	public WorkType save(WorkType workType) {
		workType=workTypeRepository.save(workType);
		return workType;
	}
	
}
