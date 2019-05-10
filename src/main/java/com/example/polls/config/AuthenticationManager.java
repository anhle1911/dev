package com.example.polls.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * @author AnhLH
 */
@Component
public class AuthenticationManager implements
    org.springframework.security.authentication.AuthenticationManager {

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    return null;
  }
}
