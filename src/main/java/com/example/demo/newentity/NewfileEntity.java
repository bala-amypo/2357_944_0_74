package com.example.demo.newentity;

import jakarta.persistence.Id;
import jakarta.validation. constraints.NotBlank;
import jakarta. validation. constraints. Email;

public class NewfileEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="Should not contain spaces")
    private String name;
    @NotBlank(message="no blank spaces")
    @Email(message="invalid")
    private String email;
}