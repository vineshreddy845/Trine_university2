package com.example.Trine_university.student_department_record;

import jakarta.persistence.Column;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "student_department_record")
public class Studentdepartmentrecord {

    private int student_id;
    private String cousrename;
    private String studentstatus;
    private int studentremainingsubjects;
    private String emailaddress;
    private String phyicaladdress;
}
