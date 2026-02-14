package com.codewithtyler.store.mappers;

import com.codewithtyler.store.dtos.UserDto;
import com.codewithtyler.store.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
