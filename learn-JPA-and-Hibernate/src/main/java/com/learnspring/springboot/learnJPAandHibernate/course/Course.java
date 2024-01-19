package com.learnspring.springboot.learnJPAandHibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // -> marks the class as a JPA entity.
public class Course {
	
	@Id // -> Primary Key
	private long id;
	
	//@Column(name="name") -> Matches Column in the database
	private String name;
	
	//@Column(name="author")
	private String author;
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Course() {
		
	}
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
}
