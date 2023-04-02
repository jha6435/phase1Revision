package com.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindingFromFileRegEx {

	public static void main(String[] args) throws IOException {
	
		Scanner obj=new Scanner(System.in);
		System.out.println("enter subject");
		String subject=obj.next();
		boolean isFound=false;
		File f=new File("D:\\forFileReader demo Ph1\\scorecard.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		
		while(line!=null) {
			var data=line.split(",");
			if(data[0].equals(subject))
			{
			System.out.println(data[1]);
			isFound=true;
			break;
			}
			line=br.readLine();
		}
br.close();
obj.close();
if(isFound==false) {
	System.out.println("subject not found");
}
	}

}
