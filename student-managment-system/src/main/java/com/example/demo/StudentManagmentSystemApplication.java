package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}
	@Autowired
 private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 =new Student(null,
		 * "haythem","saadaoui","saadaouihaithem2@gmail.com");
		 * studentRepository.save(student1); Student student2 =new Student(null,
		 * "hatem","saad","haithem2@gmail.com"); studentRepository.save(student2);
		 * Student student3 =new Student(null, "Rana","Amir","Rana@gmail.com");
		 * studentRepository.save(student3);
		 */
	}

}
