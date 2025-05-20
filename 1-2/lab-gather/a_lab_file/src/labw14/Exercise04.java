package labw14;

import java.io.*;
import java.util.zip.*;

public class Exercise04 {

    public static void main(String[] args) {
        String resourcesPath = "resources";
        String zipFileName = "result.zip";

        try {
            File resourcesDir = new File(resourcesPath);
            if (!resourcesDir.exists() || !resourcesDir.isDirectory() || resourcesDir.list().length == 0) {
                System.out.println("해당 디렉토리에 파일이 없습니다.");
                return;
            }

            try (FileOutputStream fout = new FileOutputStream(zipFileName);
                 ZipOutputStream zout = new ZipOutputStream(fout)) {

                for (File file : resourcesDir.listFiles()) {
                    if (file.isFile()) {
                        addToZipFile(file, zout);
                        System.out.println("파일명: " + file.getName() + ",크기: " + file.length() + " B");
                    }
                }
            }

            System.out.println("압축 파일이 생성되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addToZipFile(File file, ZipOutputStream zout) throws IOException {
        try (FileInputStream fis = new FileInputStream(file)) {
            ZipEntry zipEntry = new ZipEntry(file.getName());
            zout.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
            	zout.write(bytes, 0, length);
            }

            zout.closeEntry();
        }
    }
}
