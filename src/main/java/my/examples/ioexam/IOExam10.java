package my.examples.ioexam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExam10 {
    public static void main(String[] args) {
        //키보드로부터 한줄씩 입력 받아서 화면에 한줄씩 출력하시오.
        BufferedReader in = null;
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            in = new BufferedReader(isr);
            String line = null;
            while((line=in.readLine()) != null){
                System.out.println(line);

            }

        }catch(Exception e){

        }finally{
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
