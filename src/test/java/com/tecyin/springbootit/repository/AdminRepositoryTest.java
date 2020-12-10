package com.tecyin.springbootit.repository;

import com.tecyin.springbootit.pojo.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdminRepositoryTest {
    @Autowired
    private AdminRepository adminRepository;

    @Test
    void findAll() {
        System.out.println(adminRepository.findAll());
    }

    @Test
    void save() {
        Admin admin = new Admin();
        adminRepository.save(admin);

    }

    @Test
    void findByid() {
        Admin admin = adminRepository.findById(3).get();
        System.out.println(admin);
    }

    void updata() {
        Admin admin = new Admin();
    }
}
