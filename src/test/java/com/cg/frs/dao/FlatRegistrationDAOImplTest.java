package com.cg.frs.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.frs.dto.FlatRegistrationDTO;

class FlatRegistrationDAOImplTest {

	static FlatRegistrationDAOImpl flatRegistrationDAO;
	static FlatRegistrationDTO dto;
	@BeforeAll
	public static void init() {
		dto =new FlatRegistrationDTO();
		flatRegistrationDAO =new FlatRegistrationDAOImpl();
	}
	
	
	
	
	@Test
	void testRegisterFlat() {
	dto.setOwner_id(1);
	dto.setFlat_type(1);
	dto.setFlat_area(45);
    dto.setRent_amount(1000);
	dto.setDeposit_amount(2000);
	FlatRegistrationDTO flat= flatRegistrationDAO.registerFlat(dto);
	assertEquals(5,flat.getFlat_id());
		
	}

	@Test
	void testGetAllOwnerIds() {
		
		ArrayList<Integer> a =new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	assertEquals(a, flatRegistrationDAO.getAllOwnerIds());
	
	}

}
