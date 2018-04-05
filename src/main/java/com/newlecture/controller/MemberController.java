package com.newlecture.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.newlecture.entity.Note;
import com.newlecture.service.author.NoteService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	//컨트롤러 각각의 서비스는 독립적으로 생성해야한다. 집중화를 하는 방법은 프로젝트 협업을 위해 좋은 방법이 아님
	@Autowired
	private NoteService service;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login() {
		
		return "member.login";	
	}
	
	/*Spring Security 가 제공하는 처리기를 사용한다.
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String login(String id, String pwd) {
		
		return "Redirect:login";	
	}*/
	
}
