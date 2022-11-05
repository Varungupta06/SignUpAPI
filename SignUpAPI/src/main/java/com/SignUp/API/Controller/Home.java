package com.SignUp.API.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SignUp.API.entity.SignUp;
import com.SignUp.API.services.Services;

@RestController
public class Home {

	@Autowired
	private Services services;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@RequestBody() SignUp truck) {
		SignUp add = services.add(truck);
		if (add != null) {
			return "loads details added successfully ";
		} else {
			return "loads details added failed... ";
		}
	}

}
