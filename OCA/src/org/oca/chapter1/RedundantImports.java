package org.oca.chapter1;

import java.lang.System; 
import java.lang.*; //REDUNDANT
import java.util.Random; 
import java.util.*; //REDUNDANT

import java.util.Date;

public class RedundantImports {
	public void printNumber() {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
	
	public void dateValues() {
		Date date = new Date();
		java.sql.Date sqlDate = new java.sql.Date(123124);
		
		System.out.println(date.toString());
		System.out.println(sqlDate.toLocalDate());
	}
	
	
}
