package com.example.online_shop.repository;

import com.example.online_shop.enytity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
