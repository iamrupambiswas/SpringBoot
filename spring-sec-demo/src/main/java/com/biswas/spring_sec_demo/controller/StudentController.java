package com.biswas.spring_sec_demo.controller;

import com.biswas.spring_sec_demo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Biswas", "Python"),
            new Student(2, "Stark", "Java")
    ));

    @GetMapping("csrf-token")
    public CsrfToken getToken(HttpServletRequest req) {
        return (CsrfToken) req.getAttribute("_csrf");
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("student")
    public List<Student> addStudent(@RequestBody Student student) {
        students.add(student);
        System.out.println(student);
        return students;
    }

}
