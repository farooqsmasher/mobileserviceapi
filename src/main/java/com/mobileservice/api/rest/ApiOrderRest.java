package com.mobileservice.api.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api-order", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiOrderRest {
	
		
	@PostMapping(path = "/create")
	public @ResponseBody String createOrder(@RequestBody String request, 
			@RequestHeader(value="api_account_id", required=true) String accountId,
			@RequestHeader(value="api_environment", required=true) String environment) throws Exception {
		
		return "Test";
	}

}
