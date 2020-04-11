package com.paf.project.pafProject;

import java.util.List;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/students")
public class StudentResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudent() {
		List<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setName("Anuranga");
		s1.setAge(23);
		s1.setId(1);
		
		Student s2 = new Student();
		s2.setName("Laiya");
		s2.setAge(22);
		s2.setId(2);
		
		Student s3 = new Student();
		s3.setName("Samadhi");
		s3.setAge(23);
		s3.setId(3);

		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		return students;
		
	}
	
	@POST
	@Path("/student")
	@Consumes(MediaType.APPLICATION_JSON)
	public Student createStudent(Student s1) {
		System.out.println(s1);
		return s1;
		
	}
	
	
}
