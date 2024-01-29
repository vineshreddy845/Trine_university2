package com.example.Trine_university.controller;

import com.example.Trine_university.Model.Studentrecord;
import com.example.Trine_university.Repository.Repositorys;
import com.example.Trine_university.reposdepartmentrecord.Repodepartmentstudentrecord;
import com.example.Trine_university.response.Response;
import com.example.Trine_university.student_department_record.Studentdepartmentrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Repositorys repo;
    @Autowired
    private Repodepartmentstudentrecord repodepartmentstudentrecord;
    @Autowired
    private Response response;
    @GetMapping("/map")
    public String name()
    {
        return "vinesh";

    }

    @GetMapping("/call")
    public Studentrecord record(@RequestBody Studentrecord studentrecord)

    {

       return repo.save(studentrecord);
    }
    @GetMapping("/delete/{student_id}")
    public String delete(@PathVariable(value="student_id") int Student_id)
    {
        repo.deleteById(Student_id);
        return "deleted";
    }

    @GetMapping("/get")
    public List<Studentdepartmentrecord> studentdepartmentrecord()
    {
        return repodepartmentstudentrecord.findAll();
    }

    @GetMapping("/test")
    public Response studentdepartmentrecords(@RequestBody Studentrecord studentrecord)
    {
        int Studentid= studentrecord.getStudent_id();
        String Student_name=studentrecord.getStudent_name();
        String dob=studentrecord.getDOB();
        long b= repo.getCount(Studentid,Student_name,dob);
         Boolean a=b!=0;
         if(a){
             response.setValue("sucessfully retrived");
             response.setSdr(repodepartmentstudentrecord.findByStudent_id(Studentid));

         }
         return response;
    }
     @GetMapping("/map1")
    public String response(@RequestBody Studentrecord studentrecord)
    {


  return "vinesh";
    }
}
