package com.projetoXYZ.api.application.usecases;

import com.projetoXYZ.api.application.usecases.gateways.UserGateway;
import com.projetoXYZ.api.domain.entity.User;

public class CreateUserInteractor {
    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway){
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
