package com.raiff.delo.DatabaseAdapter;

import org.springframework.data.repository.CrudRepository;
import com.raiff.delo.Model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> { }
