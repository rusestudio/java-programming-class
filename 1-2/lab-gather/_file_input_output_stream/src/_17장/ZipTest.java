package _17장;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


public class ZipTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileInputStream fin = new FileInputStream("test.zip");
		ZipInputStream zin = new ZipInputStream(fin);
		ZipEntry entry = null;
		
		while((entry = zin.getNextEntry())!=null) {
			System.out.println("zipped files:" + entry.getName());
			FileOutputStream fout = new FileOutputStream(entry.getName());
			for(int c = zin.read(); c!= -1; c = zin.read()) {
				fout.write(c);
			}
			zin.closeEntry();
			fout.close();
		}
		zin.close();

	}

}
