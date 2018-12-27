package my.examples.ioexam;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExam08 {
    public static void main(String[] args) {
        byte[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,-1,18,19,20};

        ByteArrayInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new ByteArrayInputStream(array);
            out = new FileOutputStream("bytearray.dat");
            byte[] buffer = new byte[7];
            int readCount = 0;
            while((readCount = in.read(buffer)) != -1){
                out.write(buffer, 0 , readCount);
            }
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
