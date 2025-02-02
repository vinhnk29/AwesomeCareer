package com.aa.awesomecareer.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aa.awesomecareer.entity.User;
import com.aa.awesomecareer.repository.UserRepositoryCustom;

@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

	@Autowired
	private EntityManager entityManager;

	@Override
	public User findByEmail(String email) {
		TypedQuery<User> query = entityManager.createQuery("FROM User user WHERE user.email = :email", User.class);
		query.setParameter("email", email);
		return query.getSingleResult();
	}

	@Override
	public User findByUserId(Integer id) {
		TypedQuery<User> query = entityManager.createQuery("FROM User user WHERE user.id = :id", User.class);
		query.setParameter("id", id);
		return query.getSingleResult();
	}

	@Override
	public void deleteByUserId(Integer id) {
	
		
	}

	@Override
	public void saveSkillUser(User user) {
		
		
	}

}
