package br.com.meiraonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meiraonline.domain.NoticeReason;
import br.com.meiraonline.repository.NoticeReasonRepository;

@Service
public class NoticeReasonService {
	
	@Autowired
	private NoticeReasonRepository noticeReasonRepository;
	
	public List<NoticeReason> findAll(){
		return noticeReasonRepository.findAll();
	}

}
