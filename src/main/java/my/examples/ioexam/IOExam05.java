package my.examples.ioexam;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExam05 {
    public static void main(String[] args) {
        ByteArrayOutputStream out = null;
        FileInputStream in = null;
        byte[] array = null;
        try {
            in = new FileInputStream("bytearray.dat");
            out = new ByteArrayOutputStream(20);
            int readData = 0;
            while((readData = in.read()) != -1) {
                out.write(readData);
            }
            array = out.toByteArray();
            for(byte b : array){
                System.out.println(b);
            }
        }catch(Exception e){

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
