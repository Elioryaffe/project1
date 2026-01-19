package com.example.Project1.dto;


import com.example.Project1.model.Student;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;


public class StudentIn implements Serializable {
    @NotBlank
    @Length(min = 5, max = 30)
    private String fullName;

    @Min(100) @Max(800)
    private Integer psycoScore;

    @Min(30) @Max(100)
    private Double graduationScore;

    @NotBlank @Length(min = 10, max = 10)
    private String phone;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getPsycoScore() {
        return psycoScore;
    }

    public void setPsycoScore(Integer psycoScore) {
        this.psycoScore = psycoScore;
    }

    public Double getGraduationScore() {
        return graduationScore;
    }

    public void setGraduationScore(Double graduationScore) {
        this.graduationScore = graduationScore;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Student toStudent(StudentIn studentIn) {
        return new Student(
                studentIn.getFullName(),
                studentIn.getPsycoScore(),
                studentIn.getGraduationScore(),
                studentIn.getPhone(),
                null
        );
    }

    public void updateStudent(Student student) {
        student.setFullName(fullName);
        student.setPsycoScore(psycoScore);
        student.setGraduationScore(graduationScore);
        student.setPhone(phone);
    }
}