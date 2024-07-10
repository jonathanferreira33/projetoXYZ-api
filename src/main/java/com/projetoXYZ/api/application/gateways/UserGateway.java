package com.projetoXYZ.api.application.usecases.gateways;

import com.projetoXYZ.api.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
