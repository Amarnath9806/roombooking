package com.cg.frs.ui;

public class InvalidException extends Exception {
	InvalidException(){
		System.out.println("owner id is invalid");
	}
}
