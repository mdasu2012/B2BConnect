package com.bricktobrick.B2BConnect.dtos;

import java.time.LocalDate;

import com.bricktobrick.B2BConnect.entity.LoginType;
import com.bricktobrick.B2BConnect.entity.Role;

public class UserDto {
	
	private Long id;

	private String username;
	
	private String password;

	private String mobile;

	private String otp;
	
	private LocalDate createdDate;
	
	private Role role;
	
	private LoginType loginType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public LoginType getLoginType() {
		return loginType;
	}

	public void setLoginType(LoginType loginType) {
		this.loginType = loginType;
	}
	
	
	
	

}
