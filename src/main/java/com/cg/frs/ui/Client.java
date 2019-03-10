package com.cg.frs.ui;

import java.util.Scanner;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;

public class Client {

	
		public static void main(String[] args) {
			int n;
			Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Register Flat ");
		System.out.println("2. Exit");
		n= sc.nextInt();
		switch(n) {
		case 1:
			FlatRegistrationDTO flat = new FlatRegistrationDTO();
			IFlatRegistrationService flat1= new FlatRegistrationServiceImpl();
	
			System.out.println("Exsisting owner id's are:");
		System.out.println(flat1.getAllOwnerIds());
		System.out.println("Plese enter you owner id's from above list:");
		n = sc.nextInt();
		if(n>0&&n<4) {
		flat.setOwner_id(n);
		
	
		System.out.println("Select Flat Type(1-1BHK,2-2BHK):");
		n=sc.nextInt();
		flat.setFlat_type(n);
		System.out.println("enter flat area in sq.ft:");
		n=sc.nextInt();
		flat.setFlat_area(n);
		System.out.println("enter desired rent amount Rs:");
		int n1 = sc.nextInt();
		flat.setRent_amount(n);
		System.out.println("Enter desired amount Rs:");
		n= sc.nextInt();
		if(n>n1) {
		flat.setDeposit_amount(n);
		flat=flat1.registerFlat(flat);
		System.out.println("registred sucessfully flat_id:"+flat.getFlat_id());
		}
		else {
			try {
				throw new AmountException();
			} catch (AmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		else {
			try {
				throw new InvalidException();
			} catch (com.cg.frs.ui.InvalidException e) {
				// TODO Auto-generated catch block
				
			}
		}
		case 2:
			System.out.println("thank u ");
			System.exit(0);
			
		
	}
		
		}
	
}
