package com.raiff.delo.DatabaseAdapter;


import org.springframework.data.repository.CrudRepository;

import com.raiff.delo.Model.User;


public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}