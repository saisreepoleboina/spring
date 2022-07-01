package com.cg.spring.boot.service;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.cg.spring.boot.model.Remark;
import com.cg.spring.boot.model.Task;
import com.cg.spring.boot.model.AppUser;

/**
 *This UserService is responsible for performing user related services
 */
public interface AppUserService {
	/**
	 * This saveUser method will register user in system.
	 * @param user to be registered
	 * @return Registered user if successfully registered otherwise null
	 */
	public AppUser saveUser(AppUser user);
	/**
	 * This updateUser method will update user in system.
	 * @param user to be updated
	 * @return Registered user if successfully updated 
	 */
	public AppUser updateUser(AppUser user);
	/**
	 * This method is used for deleting user details in system.
	 * @param loginName of the user
	 */
	public void deleteUserByLoginName(String loginName);
	/**
	 * This method return list of all users in system.
	 * @return list of users.
	 */
	public List<AppUser> findAll();
	/**
	 * This method is used to find user in database.
	 * @param loginName of the user to be found
	 * @return user if found otherwise null
	 */
	public AppUser findUserByLoginName(String loginName);
	/**
	 * This method will return list of tasks 
	 * @return list of tasks
	 */
	public List<Task> getAllTasks(HttpSession session);
	/**
	 * This method is used to return task by taskIdentifier
	 * @param taskIdentifier of the task
	 * @return task if found otherwise null
	 */
	public Task getTaskByTaskIdentifier(String taskIdentifier, HttpSession session);
	/**
	 * This method is used for authentication and login of user
	 * @param loginName of the user
	 * @param pwd of the user
	 * @param session created for login
	 * @return logged in user
	 */
	public AppUser authenticateUser(String loginName, String pwd, HttpSession session);
	
	
	
	
	/**----------------------------------------------------------**/
	/**
	 * This function will authorize user to view task by adding task to user
	 * @param LoginName of the user
	 * @param taskIdentifier of the task
	 * @return user with authorized task
	 */
	public AppUser addUser(String taskIdentifier, String loginName);
	/**----------------------------------------------------------**/
	
	
	
	
	
	/**
	 * This method will return list of users By userType 
	 * @param userType of the user
	 * @return list of clients
	 */
	public List<AppUser> getAllUsersByUserType(String userType);
	
	


	
	/**
	 * This method is used to create task on basis of product owner and team leader
	 * @param task to be created
	 * @param loginName of the ProductOwner
	 * @return Created task if executed successfully
	 */
	public Task createTask(Task task, String ownerLoginName, String leaderLoginName);
	/**
	 * This method will delete task on basis of the task identifier
	 * 
	 * @param taskIdentifier
	 */
	public void deleteTask(String taskIdentifier);
	public Task updateTask(Task task);
	
	/**
	 * This method will assign task to the user
	 * @param taskIdentifier
	 * @param loginName of the user
	 * @return user with assigned task
	 */
	public Task assignDeveloper(String taskIdentifier, String loginName);
	/**
	 * This method is used to update the task status
	 * 
	 * @param taskIdentifer
	 * @param progress of the task
	 * @return updated task if all identifiers exist
	 */
	public Task updateTaskStatus(String taskIdentifier, String loginName, String progress);
	//find all task by user.
	public Set<Task> getUserTasks(String loginName);
	public Task getUserTask(String loginName, String taskIdentifier);
	
	/**
	 * This method will be used for adding the remark for specific Task.
	 * @param remark is the object of the Remark containing all the information about Remark.
	 * @param task_id is the unique identifier of the task for which remark is to be added.
	 * @return the saved Remark Object
	 */
	public Task addRemark(Remark remark, String taskIdentifier);
	public void removeRemark(String remarkIdentifier, String taskIdentifier);

}

