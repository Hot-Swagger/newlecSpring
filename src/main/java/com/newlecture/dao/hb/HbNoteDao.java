package com.newlecture.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.dao.NoteDao;
import com.newlecture.entity.Note;

@Repository
public class HbNoteDao implements NoteDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Note> getList(Integer page) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Note> query = session.createQuery("from Note");
		List<Note> list = query.getResultList();
		
		return list;
	}

	@Override
	@Transactional
	public Note get(Integer id) {

		Session session = sessionFactory.getCurrentSession();
		
		Note note = session.get(Note.class, id);
		
		return note;
	}

	@Override
	@Transactional
	public int insert(Note note) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
