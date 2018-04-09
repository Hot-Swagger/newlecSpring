package com.newlecture.hb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.newlecture.hb.entity.Note;

public class NoteDao {
	public Note get(int id) {
		/*설정을 읽어오는 주체*/
		SessionFactory factory = new Configuration()
									.configure("com/newlecture/hb/hibernate.cfg.xml")
									.addAnnotatedClass(Note.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		//---------------------------------------------
		/*트랜젝션 로직*/
		
		//1
		/*List<Note> list = session.createQuery("from Note").getResultList();
		
		for(Note n : list)
			System.out.println(n.toString());*/
		
		//2
		Note note = session.get(Note.class, 1);
		System.out.println(note.toString());
		
		//3
		/*Note insertNote = new Note(82, "8282", "828282");
		session.save(insertNote);*/
		
		//---------------------------------------------
		session.getTransaction().commit();
		factory.close();
		
		return note;
	}
}
