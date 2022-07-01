package com.cg.spring.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.model.Task;

/**
 *This TaskRepository will be responsible for performing all the CRUD operations on Task
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	/**
	 * This method is used to find task based on task identifier
	 * @param taskIdentifier
	 * @return task for given identifier if task exist
	 */
	public Task findByTaskIdentifier(String taskIdentifier);
	/**
	 * This method will return all task available
	 */
	List<Task> findAll();
}

