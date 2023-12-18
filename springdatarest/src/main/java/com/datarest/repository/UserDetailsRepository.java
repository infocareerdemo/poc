package com.datarest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.datarest.entity.UserDetails;

@RepositoryRestResource(path = "user", collectionResourceRel = "user")
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
	 /* we can use specific path or by default it take method name as path before access this method we need 
	   add /search after the base path like http://localhost:8080/user/search/getUserByName?name=user1 */
	
	@RestResource(path = "getUserByName", rel = "getUserByName")    
	List<UserDetails> findByUserName(@Param("name") String name);

}

/*
http://localhost:8080/profile/user  this path list the what are the operation we can do   
*/