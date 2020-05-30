package br.com.meiraonline.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.meiraonline.domain.NoticeType;
import br.com.meiraonline.service.NoticeTypeService;

@RestController
@RequestMapping(value = "/typesnotices")
public class NoticeTypeResource {

	@Autowired
	private NoticeTypeService noticeTypeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<NoticeType>> find(HttpServletResponse response){
		response.addHeader("Access-Control-Allow-Origin", "*");
		List<NoticeType> typesNotices = this.noticeTypeService.findAll();
		return ResponseEntity.ok(typesNotices);
	}
}
