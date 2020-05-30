package br.com.meiraonline.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.meiraonline.domain.Company;
import br.com.meiraonline.repository.CompanyRepository;

@RestController
@RequestMapping(value = "/companies")
public class CompanyResource {
	
	@Autowired
	private CompanyRepository companyService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Company>> find(HttpServletResponse response){
		response.addHeader("Access-Control-Allow-Origin", "*");
		List<Company> companies = this.companyService.findAll();		
		return ResponseEntity.ok(companies);
	}

}
