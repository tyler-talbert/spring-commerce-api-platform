package com.codewithtyler.store.repositories;

import com.codewithtyler.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
