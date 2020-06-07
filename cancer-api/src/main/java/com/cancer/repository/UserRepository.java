package com.cancer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cancer.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value = "SELECT * FROM users WHERE name = ?1", nativeQuery = true)
	User findByName(String name);
}
