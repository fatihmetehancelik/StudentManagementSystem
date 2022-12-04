package net.javaguides.studentmanagementsystem;

import net.javaguides.studentmanagementsystem.entity.Student;
import net.javaguides.studentmanagementsystem.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

//        Student student1 = new Student("fatih","metehan","fmc@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student("fatih123","metehan123","fmc123@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3 = new Student("fatih1223","metehan1223","fmc1223@gmail.com");
//        studentRepository.save(student3);


    }
}
