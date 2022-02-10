package com.example.springjdbctemplate;

import java.util.List;

			import org.springframework.beans.factory.annotation.Autowired;
			import org.springframework.boot.CommandLineRunner;
			import org.springframework.boot.SpringApplication;
			import org.springframework.boot.autoconfigure.SpringBootApplication;
			import org.springframework.jdbc.core.BeanPropertyRowMapper;
			import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcTemplateApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcTemplateApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String sql = "SELECT * FROM Employee";
//
//		List<Employee> employees = jdbcTemplate.query(sql,
//				BeanPropertyRowMapper.newInstance(Employee.class));
//
//		employees.forEach(System.out :: println);
//	}


	@Override
	public void run(String... args) throws Exception {
		List<Employee> listEmployees = employeeRepo.findAll();

		listEmployees.forEach(System.out :: println);
	}


}


//NEW ACTUAL