package com.ws.ac.orm.framework;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Object get(Class<?> className, Serializable key) {
		return getSession().get(className, key);
	}

	public Serializable save(Object persistentObject) {
		return getSession().save(persistentObject);
	}

	public void saveOrUpdate(Object object) {
		getSession().saveOrUpdate(object);
	}

	public void update(Object persistentObject) {
		getSession().update(persistentObject);
	}

	public void merge(Object persistentObject) {
		getSession().merge(persistentObject);
	}

	public void delete(Object persistentObject) {
		getSession().delete(persistentObject);
	}

	public void deleteById(Class<?> className, Serializable key) {
		Object object = get(className, key);
		if (object != null) {
			getSession().delete(object);
		}
	}

	public Session getSession() {
		try {
			return sessionFactory.getCurrentSession();
		} catch (Exception e) {
			return sessionFactory.openSession();
		}
	}

	public Session getSession(boolean isAlwaysNew) {
		if (isAlwaysNew)
			return sessionFactory.openSession();
		else {
			return getSession();
		}
	}
}
