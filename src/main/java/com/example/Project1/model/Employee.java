package com.example.Project1.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="employee")
@Getter
@Setter
@AllArgsConstructor
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Length(min = 5,max = 30)
    private String fullName;

    @Min(18)
    @Max(100)
    private Integer age;

    private String role;

    @Length(min = 10,max = 10)
    private String phone;

    @Length(max = 500)
    private String profilePicture;

    @Min(5500)
    private double salary;

    @NotBlank @Email(message = "Email must be valid")
    private String email;

    @Past()
    private LocalDate birthDate;

    @AssertTrue(message = "You must accept the terms of service")
    private boolean acceptedTerms;
}


