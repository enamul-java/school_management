package com.erainfotechbd.school_management.controller;

import com.erainfotechbd.school_management.entity.Student;
import com.erainfotechbd.school_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/test")
    public void saveStudent(){
        System.out.println("test called!");
        Student student = new Student();
        student.setFirstName("Enamul");
        student.setLastName("Haque");
        student.setStudentEmail("enaul3@gamail.com");
        studentRepository.save(student);

    }

}
