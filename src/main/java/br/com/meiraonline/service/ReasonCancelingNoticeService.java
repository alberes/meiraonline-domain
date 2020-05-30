package br.com.meiraonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meiraonline.domain.ReasonCancelingNotice;
import br.com.meiraonline.repository.ReasonCancelingNoticeRepository;

@Service
public class ReasonCancelingNoticeService {

	@Autowired
	private ReasonCancelingNoticeRepository reasonCancelingNoticeRepository;
	
	public List<ReasonCancelingNotice> find(){
		return this.reasonCancelingNoticeRepository.findAll();
	}
}
