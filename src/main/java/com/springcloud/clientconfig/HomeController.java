package com.springcloud.clientconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Value("${weburl}")
	private String weburl;
	
	@RequestMapping(value="/geturl")
	public String getUrl() {
		return weburl;
	}
}
