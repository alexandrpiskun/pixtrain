package com.generic.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.generic.model.Picture;

@Transactional
@Component
public class PictureDao {
	@PersistenceContext
	private EntityManager em;

	public List<Picture> getAllPictures() {
		List<Picture> list = em.createQuery("from Picture ")
				.getResultList();
		return list;
	}



}
