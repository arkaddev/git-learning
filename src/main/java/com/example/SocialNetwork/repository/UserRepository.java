package com.example.SocialNetwork.repository;

import com.example.SocialNetwork.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
