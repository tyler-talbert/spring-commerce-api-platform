package com.codewithtyler.store.mappers;

import com.codewithtyler.store.dtos.RegisterUserRequest;
import com.codewithtyler.store.dtos.UpdateUserRequest;
import com.codewithtyler.store.dtos.UserDto;
import com.codewithtyler.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(RegisterUserRequest request);

    void update(UpdateUserRequest request, @MappingTarget User user);
}
