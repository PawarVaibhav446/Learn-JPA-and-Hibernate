package com.learnspring.springboot.learnJPAandHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learnspring.springboot.learnJPAandHibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJDBCRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS", "Gaurav"));
		repository.insert(new Course(2, "Learn Java", "Vaibhav"));
		repository.insert(new Course(3, "Learn Docker", "Tukaram"));
		repository.delete(2);
		System.out.println(repository.select(1));
		System.out.println(repository.select(3));
	}
	
}
