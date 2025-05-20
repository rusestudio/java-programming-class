package labw14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Exercise1 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = null;
		FileInputStream fileInputStream = null;
		InputStreamReader inputStreamreader = null;
		BufferedReader bufferedreader = null;
		PrintStream out = null;
		
		String line;
		int characterCount = 0;
		int whitespaceCount = 0;
		int wospace=0;
		
		try {
			 file = new File("resources/KNU.txt");
			 fileInputStream = new FileInputStream(file);
			 inputStreamreader = new InputStreamReader(fileInputStream);
			 bufferedreader = new BufferedReader(inputStreamreader);
			 
			 out = new PrintStream("resources/202411965.txt");
			 //System.setOut(out);
			 
			 while ((line = bufferedreader.readLine())!= null) {
				 characterCount = (characterCount + line.length() +1); //3994
                 whitespaceCount = whitespaceCount +  line.replaceAll("\\S", "").length()+1;
                 wospace = whitespaceCount;
		         }
			 out.println("공백 포합 글자 수: " + characterCount); //3994
             out.println("공백 재외 글자 수: " + (characterCount-wospace));
             out.flush();
             System.out.println("결과가 202411965.txt에 저장되었습니다.");
             
		}catch (FileNotFoundException e) {
			System.out.println(" 파일 KNU.txt을 찿을 수 없습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bufferedreader!= null) bufferedreader.close();
            if(inputStreamreader!= null) inputStreamreader.close();
            if(fileInputStream!= null) fileInputStream.close();
            if(out!= null) out.close();
     ;
		}
			
	}

}
