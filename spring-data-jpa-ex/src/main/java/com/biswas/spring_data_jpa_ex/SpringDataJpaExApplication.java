package com.biswas.spring_data_jpa_ex;

import com.biswas.spring_data_jpa_ex.model.Student;
import com.biswas.spring_data_jpa_ex.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepository repo = context.getBean(StudentRepository.class);

//		Student s1 = context.getBean(Student.class);
//		Student s2 = context.getBean(Student.class);
//		Student s3 = context.getBean(Student.class);
//
//		s1.setRollNo(101);
//		s1.setName("Tony");
//		s1.setMarks(100);
//
//		s2.setRollNo(102);
//		s2.setName("Steve");
//		s2.setMarks(90);
//
//		s3.setRollNo(103);
//		s3.setName("Bruce");
//		s3.setMarks(75);
//
//		repo.save(s2);
//		repo.save(s3);

		System.out.println(repo.findByName("Tony"));
	}

}
