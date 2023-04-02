package com.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadAllLine {

	public static void main(String[] args) throws IOException {
		
		
		var allLine=Files.readAllLines(Paths.get("D:\\forFileReader demo Ph1\\scorecard.txt"));

		System.out.println(allLine);
		for(var v:allLine) {
			System.out.println(v);
		}
		
	}

}
