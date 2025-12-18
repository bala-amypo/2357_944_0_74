package com.example.demo.newcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.NewFileEntity;
import com.example.demo.service.service;

@RestController
public class NewfileController {
    @Autowired
    NewfileEntity src;
    @PostMapping("/post")
    public StudentEntity postdata(@RequestBody StudentEntity st){
        return src.savedata(st);
    }
    @GetMapping("/get")
    public List<StudentEntity> getdata(){
        return src.retdata();
    }
    @GetMapping("/getid/{id}")
    public StudentEntity getid(@PathVariable int id){
        return src.id(id);
    }
    @PutMapping("/put/{id}")
    public StudentEntity putdata(@PathVariable int id,@RequestBody StudentEntity st){
        return src.savedata(st);
    }
    @DeleteMapping("/delete/{id}")
    public String deletedata(@PathVariable int id){
        src.remove(id);
        return "deleted";
    }
    
}

