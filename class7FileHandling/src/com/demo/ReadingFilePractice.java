package com.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFilePractice {

	public static void main(String[] args) throws IOException {
	
		File f=new File("D:\\forFileReader demo Ph1\\score.txt");
		FileReader fr=new FileReader(f);
		
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
	}

	
	
}
