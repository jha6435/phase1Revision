package com.simplilearn.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadlLinebyLine {
	
	
	public static void main(String[]args) throws IOException {
		
	// to read data line by line we use BufferReader	
		
		File f = new File("D:\\forFileReaderdemoPh1\\score.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		
		String line = br.readLine();
		
		while(line != null)
		{
			System.out.println(line);
		line = br.readLine();												}
		
	     }
	
	
}
