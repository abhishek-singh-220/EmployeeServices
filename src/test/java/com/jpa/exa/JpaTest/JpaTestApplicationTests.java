package com.jpa.exa.JpaTest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.jpa.employeeservice.entity.Employee;


public class JpaTestApplicationTests {
	
public static void main(String[] args) throws URISyntaxException {
	RestTemplate template = new RestTemplate();
	final String baseUrl = "http://localhost:8086/employee";
	URI uri = new URI(baseUrl);

	Employee employee = new Employee(null, "Seva", 30, "M",new Date(),new Date());

	ResponseEntity<String> result = template.postForEntity(uri, employee,
			String.class);
	System.out.println(result);
}


}
