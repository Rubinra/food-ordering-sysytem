package com.miniproject.foodorderingsystem.service;

import java.util.List;
import java.util.Optional;
import com.miniproject.foodorderingsystem.model.User;

public interface LoginService {
	Optional<User> findById(Integer id);

	User save(User user);

	User updateUser(User user, Integer id);

	void delete(User user);
	List<User> findByAll();

}