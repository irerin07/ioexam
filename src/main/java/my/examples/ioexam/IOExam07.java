package my.examples.ioexam;

import java.io.*;
import java.net.URL;

public class IOExam07 {
    public static void main(String[] args) {

        InputStream in = null;
        OutputStream out = null;

        try{
            URL url = new URL("https://store.musinsa.com/app/product/detail/288965/0m");
            in = url.openStream();
            out = new FileOutputStream("musinsa.html");

            int readCount = 0;
            while((readCount = in.read()) != -1){
                out.write(readCount);
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
