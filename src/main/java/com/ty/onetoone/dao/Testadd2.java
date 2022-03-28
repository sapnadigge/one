package com.ty.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class Testadd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Branch b=em.find(Branch.class, 1);
		Address ad=b.getAddress();
		
		System.out.println(b.getBid());
		System.out.println("Branch address");
		System.out.println(ad.getAid());
		
	}

}
