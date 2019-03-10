package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dao.IFlatRegistrationDAO;
import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {
IFlatRegistrationDAO f= new FlatRegistrationDAOImpl();
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO FLAT) {
		// TODO Auto-generated method stub
		return f.registerFlat(FLAT);
	}

	public ArrayList<Integer> getAllOwnerIds() {
		// TODO Auto-generated method stub
		return f.getAllOwnerIds();
	}

}
