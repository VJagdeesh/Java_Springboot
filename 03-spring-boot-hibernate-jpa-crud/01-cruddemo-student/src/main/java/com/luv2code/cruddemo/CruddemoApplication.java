package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudent(studentDAO);
//			findStudent(studentDAO);
//			queryForAllStudents(studentDAO);
//			findStudentByLName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudent(studentDAO);
		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		int n=studentDAO.deleteAll();
		System.out.println("Number of rows deleted is "+n);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentid=3;
		studentDAO.delete(studentid);

	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentid=1;
		System.out.println("The is of student is "+studentid);
		Student mystudent=studentDAO.findById(studentid);
		mystudent.setFirstName("Joey");
		studentDAO.update(mystudent);
		System.out.println("The updated student are "+mystudent);
	}

	private void findStudentByLName(StudentDAO studentDAO) {
		List<Student> ls=studentDAO.findStudentByLastName("Rollins");
		System.out.println(ls);
	}

	private void queryForAllStudents(StudentDAO studentDAO) {
		List<Student> result=studentDAO.findAll();
		for(Student t:result)
		{
			System.out.println(t);
		}
	}

	private void findStudent(StudentDAO studentDAO) {
		Student temp=new Student("Vishnu","Ram","vishram33@gmail.com");
		// save the student obj
		studentDAO.save(temp);
		// display the id
		System.out.println("The id is "+temp.getId());

		Student t=studentDAO.findById(temp.getId());
		System.out.println(t);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		Student temp1=new Student("Roman","Reigns","ro11@gmail.com");
		Student temp2=new Student("Seth","Rollins","sr12@gmail.com");
		Student temp3=new Student("Dean","Ambrose","dean123@gmail.com");
		studentDAO.save(temp1);
		studentDAO.save(temp2);
		studentDAO.save(temp3);
	}

	private void createStudent(StudentDAO studentDAO) {
		// define the student obj
		Student temp=new Student("Vishnu","Ram","vishram33@gmail.com");
		// save the student obj
		studentDAO.save(temp);
		// display the id
		System.out.println("The id is "+temp.getId());
	}
}
