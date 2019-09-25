package com.ics.demo;

import com.ics.demo.groupaspring.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestingFeignBoss implements CommandLineRunner {
    private final FeignBoss feignBoss;

    public TestingFeignBoss(FeignBoss feignBoss) {
        this.feignBoss = feignBoss;
    }

    @Override
    public void run(String... args) throws Exception {

        Student student = feignBoss.registerStudent(new Student("94336", "Anastasia"));
        student = this.feignBoss.findById(student.getStudentNumber());
        System.out.println("Student:" + student.getId() + student.getScore());

        Company company = new Company();
        company.setId((long) 5);
        CompanyDto companyDtoDto = new CompanyDto();
        companyDtoDto.setStudentId(student.getId());
        companyDtoDto.setCompanyId(company.getId());
        this.feignBoss.requestAttachment(CompanyDto);

        System.out.println("Student: " + companyDtoDto.getStudentId() + " has an appointment with Lecturer: " + companyDtoDto.getTeacherId());
        student.setId(companyDtoDto.getStudentId());
    }

}
