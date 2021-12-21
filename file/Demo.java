package com.createiq.file;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		File file=new File("a.txt");
		
		System.out.println(file.exists());
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.exists());
	}

}
