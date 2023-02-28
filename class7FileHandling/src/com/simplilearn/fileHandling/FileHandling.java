package com.simplilearn.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
	// for read line by line we use FileReader
		
		File f = new File("D:\\forFileReaderdemoPh1\\abc.txt");
		
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
