package fio;

import java.io.File;
import java.io.FilenameFilter;


public class finddir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. get list of directories
		 File file = new File("directory path");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	        
	    
	    //2. get file with extension
	        File file2 = new File("/home/students/");
	           String[] list = file2.list(new FilenameFilter() {
	           @Override
	            public boolean accept(File dir, String name) {
	             if(name.toLowerCase().endsWith(".txt")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(String f:list){
	            System.out.println(f);
	        }
	        
	   //3.check permission
	        File my_file_dir = new File("KNU.txt");
	         if (my_file_dir.canWrite()) 
	           {
	            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
	           } 
	         else
	          {
	            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
	          }
	         if (my_file_dir.canRead()) 
	           {
	            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
	           } 
	         else
	          {
	            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
	          }  
	         
	    //4. check if dir a file or not
	         File my_file_dir2 = new File("/home/students/abc.txt");
	         if (my_file_dir2.isDirectory()) 
	           {
	            System.out.println(my_file_dir2.getAbsolutePath() + " is a directory.\n");
	           } 
	         else
	          {
	            System.out.println(my_file_dir2.getAbsolutePath() + " is not a directory.\n");
	          }
	         if (my_file_dir2.isFile()) 
	           {
	            System.out.println(my_file_dir2.getAbsolutePath() + " is a file.\n");
	           } 
	         else
	          {
	            System.out.println(my_file_dir2.getAbsolutePath() + " is not a file.\n");
	          }  
	}

}
