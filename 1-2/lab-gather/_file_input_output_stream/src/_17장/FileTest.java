package _17장;

import java.io.File;
import java.io.IOException;


public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name = "C:\\Users\\user\\eclipse";
		
        File dir = new File(name);
        String[] fileNames = dir.list();
        
        for(String s : fileNames) {
        	File f = new File(name + "/" + s);
        	System.out.println("============================");
        	System.out.println("Name: " + f.getName());
        	System.out.println("Path: " + f.getPath());
        	System.out.println("Parent: " + f.getParent());
        	System.out.println("Absolute Path: " + f.getAbsolutePath());
        	System.out.println("CanonicalPath: " + f.getCanonicalPath());
        	System.out.println("Is File: " + f.isFile());
        	System.out.println("Is Directory: " + f.isDirectory());
        	System.out.println("============================");
        	
        }

	}

}
