package com.cg.frs.dao;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;

public interface IFlatRegistrationDAO {
	FlatRegistrationDTO registerFlat(FlatRegistrationDTO FLAT);
	ArrayList<Integer> getAllOwnerIds();
}
