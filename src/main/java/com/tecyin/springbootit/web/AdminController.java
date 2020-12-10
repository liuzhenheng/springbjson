package com.tecyin.springbootit.web;

import com.tecyin.springbootit.pojo.Admin;
import com.tecyin.springbootit.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/it")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Admin> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return adminRepository.findAll(pageable);
    }

    @PostMapping("/save")
    public String save(@RequestBody Admin admin) {
        Admin result = adminRepository.save(admin);
        if (result != null) {
            return "success";
        }else {
            return "error";
        }
    }
}
