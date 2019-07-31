package com.avizva;
import java.util.* ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired 
	private BookDao dao ;
	@RequestMapping(value = "/users" , method = RequestMethod.GET , headers = "Accept=application/json")
	public List getUser(){
		HttpHeaders headers = new HttpHeaders() ;
		List<Users> users = dao.getAllUsers() ;
		return users ;
	}
}
