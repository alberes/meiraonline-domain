package br.com.meiraonline.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.meiraonline.domain.ReasonCancelingNotice;
import br.com.meiraonline.service.ReasonCancelingNoticeService;

@RestController
@RequestMapping(value = "reasonscancelingnotices")
public class ReasonCancelingNoticeResource {
	
	@Autowired
	private ReasonCancelingNoticeService reasonCancelingNoticeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ReasonCancelingNotice>> find(HttpServletResponse response){
		response.addHeader("Access-Control-Allow-Origin", "*");
		List<ReasonCancelingNotice> reasonscancelingNotices = this.reasonCancelingNoticeService.find();
		return ResponseEntity.ok(reasonscancelingNotices);
	}

}
