package com.userservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.userservice.entities.User;

public interface UserRepositories extends JpaRepository<User, String> {
	
	 String isUserExist ="select exists(select 1 from user where userId =: userId) as record";
	 @Query(value = isUserExist, nativeQuery = true)
	 public String checkUserExistance(@Param("userId") String userId);

}
