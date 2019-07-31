package com.avizva;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson {

	public static void main(String[] args) throws IOException{
		byte[] json = Files.readAllBytes(Paths.get("employee.json")) ;
		ObjectMapper objectMapper = new ObjectMapper() ;
		Employee e = objectMapper.readValue(json, Employee.class) ;
		System.out.println("Employee Object\n" + e);
		

	}

}
