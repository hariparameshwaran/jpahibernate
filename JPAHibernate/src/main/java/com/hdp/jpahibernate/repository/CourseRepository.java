package com.hdp.jpahibernate.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hdp.jpahibernate.entities.Course;

import jakarta.persistence.EntityManager;

@Repository
public class CourseRepository {
	
	@Autowired
	EntityManager em;
	
	public Course findById(int id) {
		return em.find(Course.class, id);
	}
	
	
	public void deleteById(int id) {
		Course course = em.find(Course.class, id);
		em.remove(course);
	}

}
