package com.ics.demo.groupaspring.models;

public class CompanyDto {
    private Long studentId;
    private Long companyId;

    public CompanyDto(Long studentId, Long companyId) {
        this.studentId = studentId;
        this.companyId = companyId;
    }

    public CompanyDto(){}

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
