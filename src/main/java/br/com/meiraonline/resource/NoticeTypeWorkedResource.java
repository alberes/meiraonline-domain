package br.com.meiraonline.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.meiraonline.domain.NoticeTypeWorked;
import br.com.meiraonline.service.NoticeTypeWorkedService;

@RestController
@RequestMapping(value = "typesnoticesworked")
public class NoticeTypeWorkedResource {
	
	@Autowired
	private NoticeTypeWorkedService noticeTypeWorkedService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<NoticeTypeWorked>> find(HttpServletResponse response){
		response.addHeader("Access-Control-Allow-Origin", "*");
		List<NoticeTypeWorked> typesNoticesWoked = this.noticeTypeWorkedService.findAll();
		return ResponseEntity.ok(typesNoticesWoked);
	}
}
