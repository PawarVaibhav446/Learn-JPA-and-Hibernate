package com.learnspring.springboot.learnJPAandHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learnspring.springboot.learnJPAandHibernate.course.jpa.CourseJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJDBCRepository repository;
	
	@Autowired
	private CourseJPARepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS", "Gaurav"));
		repository.insert(new Course(2, "Learn Java Spring JPA", "Vaibhav"));
		repository.insert(new Course(3, "Learn Docker", "Tukaram"));
		repository.deleteByID(1);
		System.out.println(repository.selectByID(2));
		System.out.println(repository.selectByID(3));
	}
	
}
