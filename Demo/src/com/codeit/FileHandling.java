package com.codeit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
//	  public void createFile() throws IOException {
//		  
//		  File file=new File("C:\\Users\\kagad\\OneDrive\\Desktop\\File Handling\\aakash.txt");
//			
//			file.createNewFile();
//			System.out.println("file created...");
//		    
//	  }
	
	
	
	
	public void writeDataIntoFile() throws IOException
	{
		
		
		FileWriter writer=new FileWriter("C:\\Users\\kagad\\OneDrive\\Desktop\\File Handling\\navnath.txt",true);

		for(int i=1;i<=100;i++) {
		writer.write("  My Name is Navanth..");
		
		}
		writer.close();
	
	
	
	}
	
	
//	public void readData() throws IOException {
//		
//		
//		FileReader reader=new FileReader("C:\\Users\\kagad\\OneDrive\\Desktop\\File Handling\\navnath.txt");
//		int data;
//		while((data=reader.read())!=-1)
//		{
//			
//			System.out.print((char)data);
//		}
//		
//	}
	
//	public void Login() throws IOException {
//		
//		String username="Aadi";
//		
//		String password="1234";
//		
//		FileWriter writer=new FileWriter("C:\\Users\\kagad\\OneDrive\\Desktop\\File Handling\\aakash.txt");
//	
//	   writer.write(username);
//	   
//	   writer.write(password);
//	   
//	   writer.close();
//	}
	
	public void doLogin() throws IOException {
		
		BufferedReader  bufferedReader=new BufferedReader(new FileReader("C:\\Users\\kagad\\OneDrive\\Desktop\\File Handling\\aakash.txt"));
	
		String line;
		while((line=bufferedReader.readLine())!=null)
		{
			String []credientials=line.split(":");
			
			if(credientials.length==2)
			{
			      String username= credientials[0].trim();
			      String password= credientials[1].trim();
			      
			      if(username.equals("Aadi") && password.equals("1234"))
			      {
			    	  System.out.println("Login success");
			      }
			      else
			      {
			    	  System.out.println("Login failed");
			      }
			}
		}
	
	}
	
	  
	
	//JVM will call to the main method ..
	public static void main(String[] args)  {
		
		
		FileHandling file=new FileHandling();
		try {
			file.doLogin();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			file.readData();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		
//		try {
//			file.writeDataIntoFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		try {
//		file.createFile();
//		}catch(IOException i) {
//			System.out.println(i.getMessage());
//		}
		
	}

}
