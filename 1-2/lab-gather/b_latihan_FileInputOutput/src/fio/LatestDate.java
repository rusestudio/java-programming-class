package fio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;


public class LatestDate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1. read latest date from file
		File file = new File("KNU.txt");
	       Date date=new Date(file.lastModified());
		   System.out.println("\nThe file was last modified on: "+date+"\n");
		   
		//2. read input
		   BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("Input your name: ");
		    String name = R.readLine();
		    System.out.println("Your name is: " + name);
		    
		//3.get file size in bytes, kb, mb
		    File file2 = new File("KNU.txt");
	        if(file2.exists())
	        {
	        System.out.println(filesize_in_Bytes(file));
	        System.out.println(filesize_in_kiloBytes(file));
	        System.out.println(filesize_in_megaBytes(file));
	        }
	        else 
	        System.out.println("File doesn't exist");
	         
	    	}
	 
	    	private static String filesize_in_megaBytes(File file) {
	        return (double) file.length()/(1024*1024)+" mb";
	    	}
	 
	    	private static String filesize_in_kiloBytes(File file) {
	        return (double) file.length()/1024+"  kb";
	    	}
	 
	    	private static String filesize_in_Bytes(File file) {
	        return file.length()+" bytes";
	    	}

	

}
