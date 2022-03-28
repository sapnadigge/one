package com.ty.onetoone.dao;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class TestPanadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Pan p=new Pan();
		p.setDate(LocalDateTime.now());
		p.setPanno("GPEP012345");
		p.setCountry("India");
		
		Person p1=new Person();
		p1.setName("A");
		p1.setPhone(123456);
		p1.setPan(p);
		et.begin();
		em.persist(p1);
		em.persist(p);
		et.commit();
	}

}
