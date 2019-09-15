package com.raiff.delo.DatabaseAdapter;

import com.raiff.delo.Model.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> { }
