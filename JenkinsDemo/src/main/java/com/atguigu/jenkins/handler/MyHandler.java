package com.atguigu.jenkins.handler;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description 
 * @author WisyaZZ
 * @buildTime 2017年9月5日下午6:43:26
 */
@Controller
public class MyHandler {

	@RequestMapping("/toSuccessPage")
	public String toSuccessPage(Map<String, Object> map) {
		
		map.put("data", "jenkins 初值");
		
		return "success";
	}
	
}
