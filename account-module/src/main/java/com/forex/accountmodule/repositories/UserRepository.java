package com.forex.accountmodule.repositories;

import com.forex.accountmodule.models.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository <User, String> {
    Mono<User> findByEmail (String email);
}
