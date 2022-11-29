package com.file.create;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Creation
{
	public static void main(String[] args) 
	{
		char[] arr = new char[100];
		try
		{
			File f1 = new File("D:\\saamy.txt");
			FileReader fr = new FileReader(f1);
		    
		    fr.read(arr);
		    System.out.println(arr);
		    fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}
}
