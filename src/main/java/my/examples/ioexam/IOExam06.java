package my.examples.ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExam06 {
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("bytearray.dat");
            out = new FileOutputStream("bytearray2.dat");
            int readCount = 0;
            long start = System.nanoTime();
            while((readCount = in.read()) != -1){
                out.write(readCount);
            }
            long end = System.nanoTime();
            System.out.println((end - start)/1000.0);

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
