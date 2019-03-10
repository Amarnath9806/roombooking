package com.cg.frs.dto;

public class FlatRegistrationDTO {
private int owner_id;
private String owner_name;
private String mobile;
private int flat_reg_no;
private int flat_type;
private int flat_area;
private int rent_amount;
private int deposit_amount;
private int flat_id;
public int getFlat_id() {
	return flat_id;
}
public void setFlat_id(int flat_id) {
	this.flat_id = flat_id;
}
public int getOwner_id() {
	return owner_id;
}
public void setOwner_id(int owner_id) {
	this.owner_id = owner_id;
}
public String getOwner_name() {
	return owner_name;
}
public void setOwner_name(String owner_name) {
	this.owner_name = owner_name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public int getFlat_reg_no() {
	return flat_reg_no;
}
public void setFlat_reg_no(int flat_reg_no) {
	this.flat_reg_no = flat_reg_no;
}
public int getFlat_type() {
	return flat_type;
}
public void setFlat_type(int flat_type) {
	this.flat_type = flat_type;
}
public int getFlat_area() {
	return flat_area;
}
public void setFlat_area(int flat_area) {
	this.flat_area = flat_area;
}
public int getRent_amount() {
	return rent_amount;
}
public void setRent_amount(int rent_amount) {
	this.rent_amount = rent_amount;
}
public int getDeposit_amount() {
	return deposit_amount;
}
public void setDeposit_amount(int deposit_amount) {
	this.deposit_amount = deposit_amount;
}

}
