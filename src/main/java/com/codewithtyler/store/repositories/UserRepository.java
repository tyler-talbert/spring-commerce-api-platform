package com.codewithtyler.store.repositories;

import com.codewithtyler.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
