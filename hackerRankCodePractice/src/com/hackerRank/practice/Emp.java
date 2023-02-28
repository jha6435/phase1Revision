package com.hackerRank.practice;

import java.io.*;
import java.util.*;
public class Emp {
	
	int eid;
	String ename;
	public Emp(int eid, String ename) {
		this.eid=eid;
		this.ename=ename;
	}
	
public	String toString() {
		return "emp id =	"+ eid+ "	emp name =	"+ ename;
	}
	public static void main(String[] args) {

		Emp e= new Emp(111,"ratan");
		System.out.println(e);
		System.out.println(e.toString());
		System.out.println(e.ename);
		System.out.println(e.eid);

}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
}
