package com.zororocks.moneymanager1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zororocks.moneymanager1.Models.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
