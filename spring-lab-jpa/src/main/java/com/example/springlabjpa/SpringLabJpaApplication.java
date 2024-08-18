package com.example.springlabjpa;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import lombok.Getter;

// @SpringBootApplication
// public class SpringLabJpaApplication {
//
// 	public static void main(String[] args) {
// 		SpringApplication.run(SpringLabJpaApplication.class, args);
// 	}
//
// }

public class SpringLabJpaApplication {

	public static void main(String[] args) {
		new School.Student();
	}

}

class School {

	private static String schoolName = "gangmanSchool";
	private boolean isOpen = true;
	private int code = 10000;

	public static class Student{
		private static String name = "cheolsu";
		public static String nickname = "goodguy";

		Student(){
			System.out.println("School의 schoolName : " + schoolName);
			System.out.println("School non-static 변수 : " + new School().isOpen);
		}
	}

	School(){
		System.out.println("Student의 studentName : " + Student.name);
		System.out.println("Student의 studentNickname : " + Student.nickname);
	}


}
