package com.projetoXYZ.api.infrastructure.controllers;

import com.projetoXYZ.api.domain.entity.User;

public class UserDTOMapper {
    CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(
                user.userName(),
                user.email()
        );
    }

    public User toUser(CreateUserRequest request) {
        return new User(request.username(),
                request.password(),
                request.email()
        );
    }
}
