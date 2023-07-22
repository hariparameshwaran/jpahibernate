package com.hdp.jpahibernate.repository;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdp.jpahibernate.JpaHibernateApplication;
import com.hdp.jpahibernate.entities.Course;

//@RunWith(SpringRunner.class)
@SpringBootTest(classes=JpaHibernateApplication.class)
public class CourseRepositoryTest {
	
	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	CourseRepository courseRepository;
	
	@Test
	public void contextLoads() {
		logger.info("t~~~~~~~~~~~~~~~~~~~~ TEST IS RUNNING ~~~~~~~~~~~~~~~~~~");
		Course course = courseRepository.findById(10001);
		assertEquals("JPA in 50 steps", course.getName());
	}
	
	

}
