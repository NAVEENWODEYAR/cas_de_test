package com.junit.tek;

import java.util.*;
import com.junit.entity.Student;

/**
 * @author Naveen K Wodeyar
 * @date 24-Jun-2024
 * @apiDoc com.junit.tek
 */
public class StringFromEntity {
	
	public static void main(String[] args) {

		List<Student> stList = new ArrayList<>();
					  stList.add(new Student(1L,"Ammie","12","9054525245",89.00));
					  stList.add(new Student(2L,"Bella","12","9054525245",90.00));
					  stList.add(new Student(3L,"Clara","12","9054525245",92.00));
					  stList.add(new Student(4L,"Diana","12","9054525245",98.00));
					  stList.add(new Student(5L,"Emma","12","9054525245",90.00));
					  stList.add(new Student(6L,"Flora","12","9054525245",92.00));
					  
	  List<String> list = stList.stream().map(Student::getStName).toList();
	  System.out.println("Student List "+stList+" \n Names"+list);
	}

}
