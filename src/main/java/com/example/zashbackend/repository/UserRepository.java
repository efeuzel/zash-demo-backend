package com.example.zashbackend.repository;

import com.example.zashbackend.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

}
