package com.docker.docker_demo.Respository;

import com.docker.docker_demo.Table.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
