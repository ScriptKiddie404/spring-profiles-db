package com.scriptkiddie404.profiles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scriptkiddie404.profiles.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
