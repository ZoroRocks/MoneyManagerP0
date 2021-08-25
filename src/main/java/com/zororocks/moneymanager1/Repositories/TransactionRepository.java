package com.zororocks.moneymanager1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zororocks.moneymanager1.Models.Transaction;

public interface TransactionRepository extends JpaRepository <Transaction, Long> {

}
