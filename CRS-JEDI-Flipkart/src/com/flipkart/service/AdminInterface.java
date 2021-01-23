package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.exception.CourseNotFoundException;

import java.util.List;

public interface AdminInterface {
	
	public void deleteCourse(String courseCode);
	public void addCourse(Course course);
	public List<Student> viewPendingAdmissions();
	public void approveStudent(int studentId);
	public void addProfessor(Professor professor);	
	public void assignCourse(String courseCode, String professorId) throws CourseNotFoundException ;
}
