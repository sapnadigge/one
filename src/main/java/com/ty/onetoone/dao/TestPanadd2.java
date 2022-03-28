package com.ty.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class TestPanadd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Person p=em.find(Person.class, 1);
		Pan pan=p.getPan();
		
		System.out.println(p.getName());
		System.out.println("Person Pan");
		System.out.println(pan.getPanno());
				

	}

}
