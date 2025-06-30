package com.biswas.spring_sec_demo.dao;

import com.biswas.spring_sec_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);

}
