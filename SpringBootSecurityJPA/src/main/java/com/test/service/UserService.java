package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.test.entity.Role;
import com.test.entity.User;
import com.test.repository.ProductRepository;
import com.test.repository.RolesRepository;
import com.test.repository.UserRepositiry;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private final ProductRepository productRepository;

    private final ProductService productService;
	@Autowired
	private UserRepositiry userRepositiry;
	@Autowired
	private RolesRepository rolesRepository;
	
	private PasswordEncoder passwordEncoder;

    UserService(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }
	
	public List<User> findAll(){
		return userRepositiry.findAll();
	}
	
	public User findById(int id) {
		return userRepositiry.findById(id).orElse(null);
	}
	
	public User save(User user) {
		if(user.getPassword() !=null && !user.getPassword().startsWith("$2a")) {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
		}
		return userRepositiry.save(user);
	}
	
	public void deleteById(int id) {
		userRepositiry.deleteById(id);
	}
	public List<Role> findAllRoles(){
		return rolesRepository.findAll();
	}
	
	
	
	
	
	
}
