package com.projetoXYZ.api.infrastructure.controllers;

public record CreateUserRequest(String username, String password, String email) {
}
