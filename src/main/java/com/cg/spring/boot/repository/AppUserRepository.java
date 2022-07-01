package com.cg.spring.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.model.AppUser;

/**
 *This UserRepository will be responsible for performing all the CRUD operations on User
 */
@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	/**
	 * This deleteByLoginName method will delete the User by loginName from the database.
	 * @param loginName of User to be deleted.
	 */
	public void deleteByLoginName(String loginName);
	/**
	 * This findByLoginName method will return the User by loginName from the database.
	 * @param loginName of User to be found.
	 * @return User if found otherwise null.
	 */
	public AppUser findByLoginName(String loginName);
	/**
	 * This findByLoginName method will return the User by loginName and password from the database.
	 * @param loginName of User to be found.
	 * @param pwd of User to be found.
	 * @return User if found otherwise null.
	 */
	public AppUser findByLoginNameAndPassword(String loginName, String password);
	/**
	 * This findByUserType method will return the User by UserType from the database.
	 * @param UserType of User to be found.
	 * @return User if found otherwise null.
	 */
	public List<AppUser> findByUserType(String userType);

}

