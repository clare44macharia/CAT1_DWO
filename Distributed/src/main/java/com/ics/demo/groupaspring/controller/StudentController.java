/*
package com.ics.demo.groupaspring.controller;

import com.ics.demo.InvalidInputException;
import com.ics.demo.groupaspring.NotFoundException;
import com.ics.demo.groupaspring.models.Student;
import com.ics.demo.groupaspring.repositories.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @PostMapping
    public Student register(@RequestBody Student student){
        if(student.getFirstName()==null || student.getStudentNumber()==null)
            throw new InvalidInputException("Student number or name missing. Check inputs");
        Optional<Student> s = studentRepository.findByStudentNumber(student.getStudentNumber());
        if(!s.isPresent()){
            student.setScore(5);
            return studentRepository.save(student);
        }else
            return s.get();
    }

    @GetMapping
    public Student findByStudentNumber(@RequestParam String studentNumber){
        return studentRepository.findByStudentNumber(studentNumber)
                .orElseThrow(()-> new NotFoundException("Student not found"));
    }
    }

*/
