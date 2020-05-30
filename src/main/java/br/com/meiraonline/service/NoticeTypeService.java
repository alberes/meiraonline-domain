package br.com.meiraonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meiraonline.domain.NoticeType;
import br.com.meiraonline.repository.NoticeTypeRepository;

@Service
public class NoticeTypeService {

	@Autowired
	private NoticeTypeRepository noticeTypeRepository;
	
	public List<NoticeType> findAll(){
		return noticeTypeRepository.findAll();
	}
}
