package com.namee.nonos.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.namee.nonos.domain.Account;

public class UserDetailsImpl extends User {
	
	private String username;
	private String password;
	
	public UserDetailsImpl(String username, String password, Collection<? extends GrantedAuthority> authorities,
			String username2, String password2) {
		super(username, password, authorities);
		username = username2;
		password = password2;
	}

	private static Collection<? extends GrantedAuthority> authorities(Account account) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		if (account.isAdmin()) {
			authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));		
		} else {
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		}
		return authorities;
	}
}
