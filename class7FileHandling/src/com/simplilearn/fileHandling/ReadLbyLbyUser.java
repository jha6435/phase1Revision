package com.simplilearn.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadLbyLbyUser {
		
	public static void main(String[]args) throws IOException {
		
	// to read data line by line we use BufferReader
		
		
		Scanner obj =new Scanner(System.in);
		String subject;
		System.out.println("enter subject name");
		subject = obj.nextLine();
		boolean isFound = false;
		
		File f = new File("D:\\forFileReaderdemoPh1\\score.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		
		String line = br.readLine();
		
		while(line != null)
		{
			var data = line.split(",");
			if(data[0]== subject)
			{		
			System.out.println(data[1]);
			isFound =true;
			break;
						}
		line = br.readLine();												}
		
	     

	if (isFound== false)
	{
		System.out.println("subject not found");
	}
		
	
}}
