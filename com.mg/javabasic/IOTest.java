package javabasic;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOTest {
    @Test
    public void testFileReader(){
        FileReader fileReader = null;
        try {
            File file = new File("G:\\IDEAWorkspace\\TestIDEA\\com.mg\\javabasic\\hello.txt");
            fileReader = new FileReader(file);
            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read(cbuf)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
