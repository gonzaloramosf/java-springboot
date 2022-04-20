package com.javaproject.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {
    private String name;
    private String lastname;
    private LocalDate date;
    private int age;
}
