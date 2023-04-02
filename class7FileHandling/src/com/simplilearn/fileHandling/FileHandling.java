package com.simplilearn.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
	// reading character by character
		
		File f = new File("D:\\forFileReader demo Ph1\\abc.txt");
		
	FileReader fr = new FileReader(f);
		 
	int i= fr.read();
		
	while(i!= -1)
	{
		System.out.print((char)i);
		i = fr.read();
	}
		
	fr.close();	
		
		

	}

}
