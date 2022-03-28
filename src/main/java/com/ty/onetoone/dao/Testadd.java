package com.ty.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class Testadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Address ad=new Address();
		ad.setAid(123);
		ad.setArea("kalewadi");
		ad.setPin(411027);
		ad.setState("Maharashtra");
		
		Branch b=new Branch();
		b.setAddress(ad);
		b.setBid(25631);
		b.setName("QSP");
		b.setPhone(989025);
		
		
		      
		et.begin();
		em.persist(b);
		em.persist(ad);
		et.commit();
	}

}
