package rao.rashmi.wis.hw2.Assignment2;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment2Application {

	public static HashMap<Long, Student> hmStudent;

	public static void main(String[] args) {
		hmStudent=new HashMap<Long,Student>();
		Student one=new Student("Rashmi","WIS");
		hmStudent.put(1l,one);
		Student two=new Student("Asal","WIS");
		hmStudent.put(2l,two);
		Student three=new Student("Kanishk","WIS");
		hmStudent.put(3l,three);
		SpringApplication.run(Assignment2Application.class, args);
	}
}
