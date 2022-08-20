package com.vti.entity;

import java.time.LocalDate;

public class Account {
	public int Id;
	public String email;
	public String username;
	public String fullName;
	public Department department;
	public Position position;
	public LocalDate createDate;
	public Group[] groups;
}
