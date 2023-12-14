package com.example.employee.demoemployee.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private String id;
    private String name;
    @NotBlank(message = "Cant be empty")
    private String departmentName;
    private String location;
}
