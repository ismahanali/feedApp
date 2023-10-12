package com.bptn.feedApp.repository;

import com.bptn.feedApp.jpa.User;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	// allows us to make sequal statements
	Optional<User> findByUsername(String username);

	Optional<User> findByEmailId(String email);

}
