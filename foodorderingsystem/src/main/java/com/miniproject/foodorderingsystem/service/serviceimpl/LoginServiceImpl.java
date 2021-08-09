package com.miniproject.foodorderingsystem.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.foodorderingsystem.model.User;
import com.miniproject.foodorderingsystem.repository.UserRepository;
import com.miniproject.foodorderingsystem.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserRepository userRepository;

	public Optional<User> findById(Integer id) {
		return userRepository.findById(id);
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public User updateUser(User user, Integer id) {
		user.setUid(id);
		return userRepository.save(user);
	}

	public void delete(User user) {
		userRepository.delete(user);
	}
	public List<User> findByAll() {
		return userRepository.findAll();
	}
}