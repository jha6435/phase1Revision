package com.selflearning;

public class CreateTableReturnWay {
	public void printTable(int a){
		for(int i=1;i<11;i++) {
			System.out.println(i*a);}
	}
	public static void main(String[] args) {
		CreateTableReturnWay cw= new CreateTableReturnWay();
		cw.printTable(16);
		
	}

}
