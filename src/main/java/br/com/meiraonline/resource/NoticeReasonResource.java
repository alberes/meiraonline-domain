package br.com.meiraonline.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.meiraonline.domain.NoticeReason;
import br.com.meiraonline.service.NoticeReasonService;

@RestController
@RequestMapping(value = "/reasonsnotices")
public class NoticeReasonResource {
	
	@Autowired
	private NoticeReasonService noticeReasonService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<NoticeReason>> find(HttpServletResponse response){
		response.addHeader("Access-Control-Allow-Origin", "*");
		List<NoticeReason> reasonsNotices = this.noticeReasonService.findAll();
		return ResponseEntity.ok(reasonsNotices);
	}

}
