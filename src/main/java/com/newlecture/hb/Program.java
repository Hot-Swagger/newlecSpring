package com.newlecture.hb;

import com.newlecture.hb.dao.NoteDao;
import com.newlecture.hb.entity.Note;

public class Program {
	public static void main(String[] args) {
		
		
		NoteDao noteDao = new NoteDao();
		Note note = noteDao.get(1);
	}
}
