package com.example.polls.repository;

import com.example.polls.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsernameOrEmail(String phone, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByPhone(String phone);

    Boolean existsByPhone(String phone);

}
