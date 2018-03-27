package com.newlecture.service.member;

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

}
