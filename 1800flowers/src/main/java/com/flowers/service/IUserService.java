/**
 * 
 */
package com.flowers.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.flowers.bean.User;
import com.flowers.bean.UsersResponse;

/**
 * @author Suresh Karnati
 * IUserService.java
 * v1.0
 *
 */

public interface IUserService {
	
	public List<User> readJSONFeed(ResponseEntity<List<User>> response);
	
	public List<User> getUniqueUsers(ResponseEntity<List<User>> response);
	
	public UsersResponse getAllUsersSize(ResponseEntity<List<User>> response);
	
	public List<User> updateUser(List<User> userList);
	
	public UsersResponse getUniqueUsersSize(List<User> userList);

}
