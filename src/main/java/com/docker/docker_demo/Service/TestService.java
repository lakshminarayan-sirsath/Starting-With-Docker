package com.docker.docker_demo.Service;

import com.docker.docker_demo.Table.Test;

import java.util.List;

public interface TestService {
    String create(String name);
    String read(Long id);
    String update(Long id, String updatedName);
    String delete(Long id);

    List<Test> readAll();
}
