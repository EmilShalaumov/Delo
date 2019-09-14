package com.raiff.delo.DatabaseAdapter;

import com.raiff.delo.Model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
    //Account findByEmail(String email);
}