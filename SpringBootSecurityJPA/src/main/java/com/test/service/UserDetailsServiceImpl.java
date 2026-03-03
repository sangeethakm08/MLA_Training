package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.test.entity.User;
import com.test.repository.UserRepositiry;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepositiry userRepositiry;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepositiry.getUserByUsername(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("Could not find the user");
		}
		return new MyUserDetails(user);
	}

}
