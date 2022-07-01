package com.cg.spring.boot.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * This User domain is used as data transfer object between layers.
 */

@Entity
@Table(name= "Users")
public class AppUser {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Please Enter Name")
	private String name;
	
	@NotBlank(message = "Please Enter Login Name")
	@Column(unique = true, updatable = false)
	private String loginName;
	
	@NotBlank(message = "Please Enter Password")
	@Size(min=8, max=20, message = "Please enter password of size minimum 8 and maximum 20")
	private String password;
	
	@NotBlank(message = "Please Select User Type")
	private String userType;
	
	//@JsonIgnore
	@ManyToMany
	@JoinTable(name = "assigned_tasks", joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="task_id"))
	private Set<Task> assignedTasks= new HashSet<>();

	
	@Column(name = "role")
	private Role role;

	public AppUser() {
		super();
	}

	/**
	 * @param name
	 * @param loginName
	 * @param password
	 * @param userType
	 * @param tasks
	 */
	public AppUser(String name, String loginName, String password, String userType, Set<Task> assignedTasks) {
		super();
		this.name = name;
		this.loginName = loginName;
		this.password = password;
		this.userType = userType;
		this.assignedTasks = assignedTasks;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Set<Task> getAssignedTasks() {
		return assignedTasks;
	}

	public void setAssignedTasks(Set<Task> assignedTasks) {
		this.assignedTasks = assignedTasks;
	}

	
	
}

