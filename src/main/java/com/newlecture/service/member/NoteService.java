package com.newlecture.service.member;

import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;

import com.newlecture.dao.NoteDao;
import com.newlecture.entity.Note;

public class NoteService {

	@Autowired
	private NoteDao noteDao;
	
	public int insertNote(Note note) {
		
		int result = noteDao.insert(note);
		
		return result;
	}

	public List<Note> getNoteList(Integer page) {
		
		List<Note> list = noteDao.getList(page);
		for(Note n: list) {
			String content = n.getContent();
			if(content == null) continue;
			Document document = Jsoup.parse(content);
			String text = document.text();
			if(text.length() > 250)
				text = text.substring(0, 249);
			n.setContent(text);
		}
		
		return list;
	}

	public Note getNote(Integer id) {
		
		Note result = noteDao.get(id);
		String content = result.getContent();
		Document document = Jsoup.parse(content);
		Element img = document.selectFirst("img");
		if(img != null) {
			Set<String> clsName = img.classNames();
			boolean hasClsName = false;
			for(String n: clsName) {
				if(n.equals("detail-main-img")){
					hasClsName = true;
				}
			}
			if(!hasClsName)
				img.addClass("detail-main-img");
		}
		result.setContent(document.toString());
		return result;
	}

}
