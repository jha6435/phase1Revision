package com.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LearnLinebyLine {

	public static void main(String[] args) throws IOException {
	
		
		File f=new File("D:\\forFileReader demo Ph1\\score.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String text=br.readLine();
		while(text!=null) {
			System.out.println(text);
			
			text=br.readLine();
		}
		
		br.close();
		
		
		

	}

}
