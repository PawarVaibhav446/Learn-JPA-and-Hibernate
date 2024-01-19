package com.learnspring.springboot.learnJPAandHibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.learnspring.springboot.learnJPAandHibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course selectByID(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteByID(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}
