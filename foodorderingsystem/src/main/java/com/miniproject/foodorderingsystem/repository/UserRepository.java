package com.miniproject.foodorderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.foodorderingsystem.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
