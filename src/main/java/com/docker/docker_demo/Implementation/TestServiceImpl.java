package com.docker.docker_demo.Implementation;

import com.docker.docker_demo.Respository.TestRepository;
import com.docker.docker_demo.Service.TestService;
import com.docker.docker_demo.Table.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestRepository testRepository;

    @Override
    public String create(String name) {
        try {
            Test test = new Test();
            test.setName(name);
            testRepository.save(test);
        } catch (Exception e){
            System.out.printf(e.getMessage());
        }
        return name;
    }

    @Override
    public String read(Long id) {
        try{
            Optional<Test> opTest = testRepository.findById(id);
            if(opTest.isPresent()){
                Test test = opTest.get();
                return "name: "+test.getName();
            } else {
                return "invalid id.";
            }
        } catch(Exception e){
            System.out.printf(e.getMessage());
            return "read action failed";
        }
    }

    @Override
    public String update(Long id, String updatedName) {
        try{
            Optional<Test> opTest = testRepository.findById(id);
            if(opTest.isPresent()){
                Test test = opTest.get();
                test.setName(updatedName);
                testRepository.save(test);
                return "Updated name: "+updatedName;
            } else {
                return "invalid id.";
            }
        } catch(Exception e){
            System.out.printf(e.getMessage());
            return "updation failed";
        }
    }

    @Override
    public String delete(Long id) {
        try{
            Optional<Test> opTest = testRepository.findById(id);
            if(opTest.isPresent()){
                Test test = opTest.get();
                testRepository.deleteById(id);
                return "name deleted by id: "+id;
            } else {
                return "invalid id.";
            }
        } catch(Exception e){
            System.out.printf(e.getMessage());
            return "deletion failed";
        }
    }

    @Override
    public List<Test> readAll() {
        List<Test> allTest = null;
        try{
            allTest = testRepository.findAll();
        } catch (Exception e){
            System.out.printf(e.getMessage());
        }
        return allTest;
    }


}
