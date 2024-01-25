package com.example.Trine_university.Model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="studentrecord")
public class Studentrecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Student_id")
    private int Student_id;
    @Column(name="Student_name")
    private String Student_name;
    @Column(name="DOB")
    private String DOB;
}
