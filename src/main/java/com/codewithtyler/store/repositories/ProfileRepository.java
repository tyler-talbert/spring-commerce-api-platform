package com.codewithtyler.store.repositories;

import com.codewithtyler.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}