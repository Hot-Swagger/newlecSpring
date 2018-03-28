package com.newlecture.controller.member;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.newlecture.entity.Note;
import com.newlecture.service.member.NoteService;

@Controller("MemberNoteController")
@RequestMapping("/member/note/")
public class NoteController {
	
	//컨트롤러 각각의 서비스는 독립적으로 생성해야한다. 집중화를 하는 방법은 프로젝트 협업을 위해 좋은 방법이 아님
	@Autowired
	private NoteService service;
	
	@RequestMapping("list")
	public String list() {
		
		return "member/note/list";
	}
	
	@RequestMapping("detail")
	public String detail() {
	
		return "member/note/detail";
	}
	
	@RequestMapping("edit")
	public String edit() {
		
		return "member/note/edit";
	}
	
	// 요청방식에 따른 매서드 분기가 가능하다.
	@RequestMapping(value="reg", method=RequestMethod.GET)
	public String reg() {
		
		return "member/note/reg";
	}
	
	// 요청방식에 따른 매서드 분기가 가능하다.
	// 폼에서 전송된 데이터의 name과 매서드의 파라미터 이름,자료형이 같다면 자동으로 파라미터로 전달됨
	// 매서드의 파라미터를 구조화된 데이터로 설정하면 전달된 폼 데이터의 이름을 파라미터의 셋터함수와 비교하여 변수명이 같을경우 객체화하여 전달
	@RequestMapping(value="reg", method=RequestMethod.POST)
	
	public String reg(Note note, MultipartFile file, HttpServletRequest request) {
		
		String memberId = "newlec";
		ServletContext ctx = request.getServletContext();
		String path = ctx.getRealPath("/resources/note/" + memberId);
		
	    File f = new File(path);
	    if(!f.exists())
	    	f.mkdirs();
	    
		if(!file.isEmpty()) {
			try {
				String fileName = file.getOriginalFilename();
				
				InputStream fis = file.getInputStream();
				
				FileOutputStream fos = new FileOutputStream(path + File.separator + fileName);
				
				byte[] buf = new byte[1024];
				int size = 0;
				while((size = fis.read(buf,0,1024)) != -1) {
					fos.write(buf,0,size);
				}
				fis.close();
				fos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		service.insertNote(note);
		
		return "redirect:list";	// list페이지로 리다이렉트 (현재 url기준으로 리다이렉트)
	}
	
	@RequestMapping("data")
	@ResponseBody	// 매서드의 리턴값이 뷰가 아닌 데이터임을 정의하는 어노테이션
	public String data() {
		
		return "안녕하세요";	//뷰가 아니라는 어노테이션을 달아줄수 있음
	}
	
}
