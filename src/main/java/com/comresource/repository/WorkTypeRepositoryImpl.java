package com.comresource.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.comresource.model.WorkType;

@Repository("workTypeRepository")
public class WorkTypeRepositoryImpl implements WorkTypeRepository {

	@PersistenceContext
	private EntityManager em;
	
	public WorkType save(WorkType workType) {
		
		em.persist(workType);
		em.flush();
		return workType;
	}

}
