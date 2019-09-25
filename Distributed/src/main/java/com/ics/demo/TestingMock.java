/*
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ics.demo;


import com.ics.demo.FeignMockClient;
import com.ics.demo.groupaspring.models.Student;
import com.ics.demo.groupaspring.models.Teacher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestingMock implements CommandLineRunner {
    private final FeignMockClient feignMockClient;

    public TestingMock(FeignMockClient feignMockClient) {
        this.feignMockClient = feignMockClient;
    }

    public void run(String... args) throws Exception {
        Student student = new Student("094567", "Claudine");
        student = this.feignMockClient.findById(student.getStudentNumber());

    }
}
*/
