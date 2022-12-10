package com.example.webapl.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, ADMIN, AUTH;

    @Override
    public String getAuthority() {
        return name();
    }
}