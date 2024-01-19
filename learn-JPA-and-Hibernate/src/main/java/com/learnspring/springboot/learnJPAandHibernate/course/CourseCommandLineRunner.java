package com.learnspring.springboot.learnJPAandHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learnspring.springboot.learnJPAandHibernate.course.jpa.CourseJPARepository;
import com.learnspring.springboot.learnJPAandHibernate.course.springdatajpa.CourseSpringDataJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJDBCRepository repository;
	
//	@Autowired
//	private CourseJPARepository repository;
	
	@Autowired
	private CourseSpringDataJPARepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS", "Gaurav"));
		repository.save(new Course(2, "Learn Java Spring JPA", "Vaibhav"));
		repository.save(new Course(3, "Learn Docker", "Tukaram"));
		repository.deleteById(1L);
		System.out.println(repository.findById(2L));
		System.out.println(repository.findById(3L));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Vaibhav"));
		System.out.println(repository.findByName("Learn Docker"));
	}
	
}
