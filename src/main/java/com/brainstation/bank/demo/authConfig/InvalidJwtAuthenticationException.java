package com.brainstation.bank.demo.authConfig;

import org.springframework.security.core.AuthenticationException;

public class InvalidJwtAuthenticationException extends AuthenticationException {

    static final long serialVersionUID = -761503632186596342L;

    public InvalidJwtAuthenticationException(String msg) {
        super(msg);
    }

}
