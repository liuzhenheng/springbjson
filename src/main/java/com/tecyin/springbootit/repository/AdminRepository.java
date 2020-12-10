package com.tecyin.springbootit.repository;

import com.tecyin.springbootit.pojo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
