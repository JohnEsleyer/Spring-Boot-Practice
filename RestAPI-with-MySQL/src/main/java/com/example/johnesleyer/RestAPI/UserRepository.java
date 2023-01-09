package com.example.johnesleyer.RestAPI;

import org.springframework.data.repository.CrudRepository;
import com.example.johnesleyer.RestAPI.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
}
