package com.innova.a1.oop.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data //getter and setter ToString hash ...
@NoArgsConstructor
@AllArgsConstructor
public class _A2_Bean_Lombok implements Serializable {

    // nesne değişkenleri (object variable)
    private int studentId;
    private String studentName;
    private String studentSurname;
    private Date createdDate;


}
