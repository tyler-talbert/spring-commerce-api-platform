package com.codewithtyler.store.repositories;

import com.codewithtyler.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}