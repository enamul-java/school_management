package com.erainfotechbd.school_management.repository;

import com.erainfotechbd.school_management.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    private void saveStudent(){
        Student student = new Student();
        student.setFirstName("Enamul");
        student.setLastName("Haque");
        student.setStudentEmail("enaul@gamail.com");
        studentRepository.save(student);
    }

}