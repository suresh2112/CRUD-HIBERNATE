package com.createiq.file;

import java.io.File;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		
		File file=new File("createiq.txt");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.exists());
		
		
		File file2=new File(file, "hyd.txt");
		System.out.println(file2.exists());
		file2.mkdir();
		System.out.println(file2.exists());
		
		File file3=new File(file2, "srnagar.txt");
		System.out.println(file3.exists());
		try {
			file3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file3.exists());
		
		
		
		File file4=new File("C:\\Users\\sures\\Documents");
		String []s=file4.list();
		for (String string : s) {
			
			System.out.println(string);
			
		}
		
		
		
	}

}
