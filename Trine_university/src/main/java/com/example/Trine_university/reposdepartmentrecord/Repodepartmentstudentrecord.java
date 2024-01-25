package com.example.Trine_university.reposdepartmentrecord;

import com.example.Trine_university.student_department_record.Studentdepartmentrecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface Repodepartmentstudentrecord extends MongoRepository<Studentdepartmentrecord,Integer> {
//    @Query("select count(*) from Studentrecord where student_id=:stuid")
//    long getcount(int stuid);

    @Query("{'student_id': ?0}")
    Optional<Studentdepartmentrecord> findByStudent_id(int student_id);


}
