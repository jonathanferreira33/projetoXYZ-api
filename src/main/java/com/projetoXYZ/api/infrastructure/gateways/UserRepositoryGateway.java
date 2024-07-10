package com.projetoXYZ.api.infrastructure.gateways;

import com.projetoXYZ.api.domain.entity.User;
import com.projetoXYZ.api.infrastructure.persistence.UserEntity;
import com.projetoXYZ.api.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements com.projetoXYZ.api.application.usecases.gateways.UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper mapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = mapper.toEntity(userDomainObj);
        UserEntity saveObj = userRepository.save(userEntity);
        return mapper.toDomainObj(saveObj);
    }
}
