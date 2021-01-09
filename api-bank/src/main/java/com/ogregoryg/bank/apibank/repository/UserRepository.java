package com.ogregoryg.bank.apibank.repository;

import com.ogregoryg.bank.apibank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
