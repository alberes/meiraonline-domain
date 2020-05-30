package br.com.meiraonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meiraonline.domain.NoticeTypeWorked;
import br.com.meiraonline.repository.NoticeTypeWorkedRepository;

@Service
public class NoticeTypeWorkedService {

	@Autowired
	private NoticeTypeWorkedRepository noticeTypeWorkedRepository;
	
	public List<NoticeTypeWorked> findAll(){
		return this.noticeTypeWorkedRepository.findAll();
	}
}
