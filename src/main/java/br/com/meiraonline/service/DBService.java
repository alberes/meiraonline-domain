package br.com.meiraonline.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meiraonline.domain.Company;
import br.com.meiraonline.domain.Employee;
import br.com.meiraonline.domain.NoticeReason;
import br.com.meiraonline.domain.NoticeType;
import br.com.meiraonline.domain.NoticeTypeWorked;
import br.com.meiraonline.domain.ReasonCancelingNotice;
import br.com.meiraonline.repository.CompanyRepository;
import br.com.meiraonline.repository.EmployeeRepository;
import br.com.meiraonline.repository.NoticeReasonRepository;
import br.com.meiraonline.repository.NoticeTypeRepository;
import br.com.meiraonline.repository.NoticeTypeWorkedRepository;
import br.com.meiraonline.repository.ReasonCancelingNoticeRepository;

@Service
public class DBService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private NoticeReasonRepository noticeReasonRepository;
	
	@Autowired
	private NoticeTypeRepository noticeTypeRepository;

	@Autowired
	private NoticeTypeWorkedRepository noticeTypeWorkedRepository;
		
	@Autowired
	private ReasonCancelingNoticeRepository reasonCancelingNoticeRepository;
	
	public void instantiateTestDataBase() {
		List<Company> companies = new ArrayList<Company>();
		List<Employee> emploiees = new ArrayList<Employee>();
		List<NoticeReason> reasonsNotices = new ArrayList<NoticeReason>();
		List<NoticeType> typesNotices = new ArrayList<NoticeType>();
		List<NoticeTypeWorked> typesNoticesWoked = new ArrayList<NoticeTypeWorked>();
		List<ReasonCancelingNotice> reasonscancelingNotices = new ArrayList<ReasonCancelingNotice>();
		
		for(int i = 1; i <= 10; i++) {
			companies.add(new Company("Company " + i));
			reasonsNotices.add(new NoticeReason("NoticeReason " + i));
			typesNotices.add(new NoticeType("NoticeType " + i));
			typesNoticesWoked.add(new NoticeTypeWorked("NoticeTypeWorked " + i));
			reasonscancelingNotices.add(new ReasonCancelingNotice("ReasonCancelingNotice " + i));
		}
		
		for(int i = 1; i <= 200; i++) {
			emploiees.add(new Employee("Employee " + i));
		}

		companyRepository.saveAll(companies);
		employeeRepository.saveAll(emploiees);
		noticeReasonRepository.saveAll(reasonsNotices);
		noticeTypeRepository.saveAll(typesNotices);
		noticeTypeWorkedRepository.saveAll(typesNoticesWoked);
		reasonCancelingNoticeRepository.saveAll(reasonscancelingNotices);
	}

}
