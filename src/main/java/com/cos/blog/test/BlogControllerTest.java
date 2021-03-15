package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller, Repository, Service, 
@RequestMapping("/test")
@RestController // 특정 어노테이션(@Component)이 붙어있는 클래스 파일들을 new해서 (IOC) 스프링 컨테이너에 관리해준다.
public class BlogControllerTest {

	@GetMapping("/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}

}
