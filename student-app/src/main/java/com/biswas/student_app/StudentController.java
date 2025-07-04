package com.biswas.student_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudent")
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @RequestMapping("/addStudent")
    public Student addStudent() {
        Student newStudent = new Student();
        newStudent.setName("Tony");
        newStudent.setAge(35);

        return repo.save(newStudent);
    }

}
