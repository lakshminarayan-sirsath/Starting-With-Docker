package com.docker.docker_demo.Controller;

import com.docker.docker_demo.Implementation.TestServiceImpl;
import com.docker.docker_demo.Table.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestServiceImpl testService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Docker";
    }

    @PostMapping("/store_name")
    public String storeName(String name){
        return testService.create(name);
    }

    @GetMapping("/read_name")
    public String readName(Long id){
        return testService.read(id);
    }

    @PutMapping("/update_name")
    public String updateName(Long id, String updateName){
        return testService.update(id, updateName);
    }

    @DeleteMapping("/delete_name")
    public String deleteName(Long id){
        return testService.delete(id);
    }


    @GetMapping("/read_all_name")
    public List<Test> readAllName(){
        return testService.readAll();
    }

}


