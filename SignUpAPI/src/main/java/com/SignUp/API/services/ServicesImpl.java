package com.SignUp.API.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SignUp.API.Dao.SignUpDao;
import com.SignUp.API.entity.SignUp;

@Service
public class ServicesImpl implements Services {

	@Autowired
	private SignUpDao dao;

	@Override
	public SignUp add(SignUp signUp) {
		return dao.save(signUp);
	}

}
