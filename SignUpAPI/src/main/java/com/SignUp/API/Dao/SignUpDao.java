package com.SignUp.API.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SignUp.API.entity.SignUp;

@Repository
public interface SignUpDao extends JpaRepository<SignUp, Integer> {

}
