package br.com.meiraonline.resource;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.meiraonline.domain.Employee;
import br.com.meiraonline.service.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeResource {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/company/{id}", method = RequestMethod.GET)
	public ResponseEntity<Page<Employee>> find(
			@RequestParam(value="page", defaultValue="0") Integer page, 
			@RequestParam(value="linesPerPage", defaultValue="24") Integer linesPerPage, 
			@RequestParam(value="orderBy", defaultValue="id") String orderBy, 
			@RequestParam(value="direction", defaultValue="ASC") String direction,
			HttpServletResponse response){
		response.addHeader("Access-Control-Allow-Origin", "*");
		Page<Employee> employees = employeeService.findAll(page, linesPerPage, orderBy, direction);
		return ResponseEntity.ok(employees);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Employee> find(@PathVariable Long id){
		Employee employee = employeeService.find(id);
		return ResponseEntity.ok().body(employee);
	}

}
