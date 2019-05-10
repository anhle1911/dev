package com.example.polls.controller;

import com.example.polls.model.User;
import com.example.polls.payload.JwtAuthenticationResponse;
import com.example.polls.payload.LoginRequest;
import com.example.polls.repository.UserRepository;
import com.example.polls.security.JwtTokenProvider;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserRepository userRepository;
  @Autowired
  PasswordEncoder passwordEncoder;

  @Autowired
  JwtTokenProvider tokenProvider;

  @PostMapping("/login")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
    if (!userRepository.existsByPhone(loginRequest.getPhone())) {
      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
      String lastDate = sdf.format(new Date());
      User user = new User();
      user.setPhone(loginRequest.getPhone());
      user.setHongbao(0);
      user.setCreateTime(lastDate);
      user.setYearmonthday(lastDate);
      user.setLoginCount(0);
      userRepository.save(user);
    }
    UsernamePasswordAuthenticationToken authentication =
        new UsernamePasswordAuthenticationToken(
            loginRequest.getPhone(), null, null
        );


    String jwt = tokenProvider.generateToken(loginRequest.getPhone());
    JwtAuthenticationResponse res = new JwtAuthenticationResponse();
    res.setAccessToken(jwt);
    res.setSuccess();
    return ResponseEntity.ok(res);
  }
}
