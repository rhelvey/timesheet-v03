package com.comresource.service;

import java.util.List;

import com.comresource.model.Activity;
import com.comresource.model.WorkType;

public interface WorkTypeService {
	
	
	List<Activity> findAllActivities();

	WorkType save(WorkType workType);

}