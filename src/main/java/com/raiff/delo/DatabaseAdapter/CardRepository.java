package com.raiff.delo.DatabaseAdapter;

import com.raiff.delo.Model.User;
import org.springframework.data.repository.CrudRepository;

import com.raiff.delo.Model.Card;


public interface CardRepository extends CrudRepository<Card, Integer> {
    Card findByAccountId(Integer accountId);
}
