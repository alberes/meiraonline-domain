package br.com.meiraonline.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.com.meiraonline.domain.Employee;
import br.com.meiraonline.exception.MeiraOnlineObjectNotFoundException;
import br.com.meiraonline.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Page<Employee> findAll(Integer page, Integer linesPerPage, String orderBy, String direction){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return employeeRepository.findAll(pageRequest);
	}

	public Employee find(Long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		return employee.orElseThrow(() -> new MeiraOnlineObjectNotFoundException(
				"Entity not found. Id: " + id + ", Type: " + Employee.class.getName()));
	}
}
