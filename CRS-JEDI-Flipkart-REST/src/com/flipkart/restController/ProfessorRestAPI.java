package com.flipkart.restController;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.flipkart.bean.Course;
import com.flipkart.bean.EnrolledStudent;
import com.flipkart.service.ProfessorInterface;
import com.flipkart.service.ProfessorOperation;

@Path("/professor")
public class ProfessorRestAPI {
	ProfessorInterface professorInterface=ProfessorOperation.getInstance();
	
	@GET
	@Path("/getEnrolledStudents")
	@Produces(MediaType.APPLICATION_JSON)
	public List<EnrolledStudent> viewEnrolledStudents(@QueryParam("profId") String profId)
	{
		List<EnrolledStudent> students=new ArrayList<EnrolledStudent>();
		try
		{
			students=professorInterface.viewEnrolledStudents(profId);
		}
		catch(Exception ex)
		{
			return null;
		}	
		return students;
	}
	
	@GET
	@Path("/getCourses")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> getCourses(@QueryParam("profId") String profId)
	{
		List<Course> courses=new ArrayList<Course>();
		try
		{
			courses=professorInterface.getCourses(profId);	
		}
		catch(Exception ex)
		{
			return null;
		}
		return courses;
	
	}
	
	@POST
	@Path("/addGrade")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addGrade()
	{
		
	}
	
	
}
