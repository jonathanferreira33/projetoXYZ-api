package com.projetoXYZ.api.infrastructure.gateways;

import com.projetoXYZ.api.domain.entity.User;
import com.projetoXYZ.api.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj){
        return new UserEntity(
                userDomainObj.userName(),
                userDomainObj.password(),
                userDomainObj.email()
        );
    }

    User toDomainObj(UserEntity userEntity){
        return new User(
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.getEmail()
        );
    }
}
