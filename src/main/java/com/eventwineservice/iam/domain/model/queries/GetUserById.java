package com.eventwineservice.iam.domain.model.queries;


import com.eventwineservice.iam.domain.model.aggregates.User;
import com.eventwineservice.iam.domain.repositories.UserRepository;

import java.util.Optional;

public class GetUserById {
    private final UserRepository userRepository;
    public GetUserById(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> execute(Long id) {
        return userRepository.findById(id);
    }
}
