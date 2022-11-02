package com.xworkz.krawards.runner;

import com.xworkz.krawards.Repository.KRAwardsRepo;
import com.xworkz.krawards.Repository.KRAwrdsRepoImpl;
import com.xworkz.krawards.Service.KRAwardeesServiceImpl;
import com.xworkz.krawards.Service.KRAwardesService;
import com.xworkz.krawards.entity.KRAwardsEntity;

public class EntityRunner {

	public static void main(String[] args) {
		KRAwardsEntity awardsEntity = new KRAwardsEntity(1, "PunithRajkumar", 2022, "Cinema", false, 40, "Madras");
		KRAwardsEntity awardsEntity1 = new KRAwardsEntity(2, "Kuvempu", 1992, "Literature", false, 89, "Kuppalli");

		KRAwardsEntity awardsEntity2 = new KRAwardsEntity(3, "Dr. Rajkumar", 1992, "Cinema", false, 76, "Gajanur");
		KRAwardsEntity awardsEntity3 = new KRAwardsEntity(4, "S.Nijalingappa",1999, "Politics", true,66 , "haluguru");
		KRAwardsEntity awardsEntity4 = new KRAwardsEntity(5, "C.N.R.Rao", 2000, "Science", true, 78, "Mysore");
		KRAwardsEntity awardsEntity5 = new KRAwardsEntity(6, "Bhimsen Joshi", 2005, "Music", false, 80, "Gadag");
		KRAwardsEntity awardsEntity6 = new KRAwardsEntity(7, "Shri. Sri Shivakumara Swamiji", 2007, "Social Science", false, 90, "Thumkur");
		KRAwardsEntity awardsEntity7 = new KRAwardsEntity(8, "Dr. J. Javaregowda", 2008, "Education & Literature", true, 70, "Karwar");
		KRAwardsEntity awardsEntity8 = new KRAwardsEntity(9, "Dr. Virendra Hegde", 2009, "Social Service",true, 60, "Bantwal");
		KRAwardsEntity awardsEntity9 = new KRAwardsEntity(10, "dr.Devi Prasad shetty", 2003, "Medical", true, 90, "Mangaluru");

		System.out.println(awardsEntity);
		System.out.println(awardsEntity1);
		System.out.println(awardsEntity2);
		System.out.println(awardsEntity3);
		System.out.println(awardsEntity4);
		System.out.println(awardsEntity5);
		System.out.println(awardsEntity6);
		System.out.println(awardsEntity7);
		System.out.println(awardsEntity8);
		System.out.println(awardsEntity9);
		
		
		KRAwardeesServiceImpl impl = new KRAwardeesServiceImpl();
		impl.validateAndSave(awardsEntity);
		System.out.println("=======================================");
		impl.validateAndSave(awardsEntity1);
		System.out.println("=======================================");

		impl.validateAndSave(awardsEntity2);
		System.out.println("=======================================");

		impl.validateAndSave(awardsEntity3);
		System.out.println("=======================================");

		impl.validateAndSave(awardsEntity4);
		System.out.println("========================================");

		impl.validateAndSave(awardsEntity5);
		System.out.println("========================================");

		impl.validateAndSave(awardsEntity6);
		System.out.println("========================================");

		impl.validateAndSave(awardsEntity7);
		System.out.println("========================================");

		impl.validateAndSave(awardsEntity8);
		System.out.println("========================================");

		impl.validateAndSave(awardsEntity9);
		System.out.println("=======================================");


	
		}
	
		
	}


