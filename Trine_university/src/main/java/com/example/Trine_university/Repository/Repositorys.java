package com.example.Trine_university.Repository;

import com.example.Trine_university.Model.Studentrecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.ui.Model;
@org.springframework.stereotype.Repository
public interface Repositorys extends JpaRepository<Studentrecord,Integer> {

    @Query("select count(*) from Studentrecord where Student_id=:Student_id and Student_name=:Student_name and DOB=:DOB")
    long getCount(int Student_id, String Student_name, String DOB);
//    @Query("select Student_id from Studentrecord where Student_id=:Student_id")
//    public Integer Id(int Student_id);

}
