package com.codewithtyler.store.repositories;

import com.codewithtyler.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}