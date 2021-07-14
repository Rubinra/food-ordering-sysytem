package com.miniproject.foodorderingsystem.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.miniproject.foodorderingsystem.model.User;
import com.miniproject.foodorderingsystem.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;

	@PostMapping("/register")
	User addUser(@RequestBody User user) {
		System.out.println("Inside register controller");
		User savedUser = loginService.save(user);
		return savedUser;
	}

	@GetMapping("/login")
	public String login(HttpServletRequest request) throws SQLException {
		System.out.println("Inside login controller");
		String name = request.getParameter("uname");
		String password = request.getParameter("password");

		ResultSet rs = User.validate(name, password);
		if (rs.next()) {
			String usertype = rs.getString("usertype");

			// String uid = rs.getString("uid");

			if (usertype.equals("user")) {
				System.out.println("USER enterted");
				return "USER entered";
			} else if (usertype.equals("admin")) {
				System.out.println("ADMIN enterted");
				return "ADMIN entered";

			}
		} else {
			System.out.println("sorry, username or password error!");

		}
		return "sorry, username or password error!";

	}

	@PutMapping("/updateuser/{id}")
	User updateUser(@PathVariable Integer id, @RequestBody User user) {
		User updatedUser = loginService.updateUser(user, id);
		return updatedUser;
	}

	@DeleteMapping("/deleteuser")
	Map<String, String> deleteUser(@RequestParam Integer id) {
		Map<String, String> status = new HashMap<>();
		Optional<User> user = loginService.findById(id);
		if (user.isPresent()) {
			loginService.delete(user.get());
			status.put("Status", "User deleted successfully");
		} else {
			status.put("Status", "User does not exist");
		}
		return status;
	}

}
