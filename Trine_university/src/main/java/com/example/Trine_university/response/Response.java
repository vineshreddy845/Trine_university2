package com.example.Trine_university.response;

import com.example.Trine_university.student_department_record.Studentdepartmentrecord;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Data
public class Response {

    private Optional<Studentdepartmentrecord> sdr;
    private String value;
}
