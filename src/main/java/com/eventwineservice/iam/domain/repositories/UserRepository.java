package com.eventwineservice.iam.domain.repositories;

import com.eventwineservice.iam.domain.model.aggregates.User;
import com.eventwineservice.iam.domain.model.valueobjects.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(Email email);
    Optional<User> findById(Long id);
}
