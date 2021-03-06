package com.chinasei.struts1.user.Model;

import com.chinasei.struts1.utils.IdGenerator;

import java.io.Serializable;

public class Users implements Serializable {
	private static final long serialVersionUID = -3096556261607251663L;
	private String id = IdGenerator.createId();
	private String name;
	private String password;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
