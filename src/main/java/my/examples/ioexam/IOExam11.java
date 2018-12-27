package my.examples.ioexam;

import java.io.*;

public class IOExam11 {
    public static void main(String[] args) {
        BufferedReader in = null;
        PrintWriter out = null;

        try{
            int lineCount = 1;
            //절대경로는 C:/로 시작하거나 /로 시작하는 경로
            //상대경로는 프로그램이 실행되는 경로
            in = new BufferedReader(new FileReader("D:\\Riot Games\\League of Legends\\Logs\\Game - R3d Logs\\2017-05-01T23-33-09_r3dlog.txt"));
            out = new PrintWriter("newText2.txt");
            out = new PrintWriter(new FileWriter("newText2.txt"));
            String line = null;
            while ((line = in.readLine()) != null) {
                out.println(lineCount + ": " + line);
                ++lineCount;
            }

        }catch(Exception e ){
            e.printStackTrace();
        }finally{
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.close();
        }
    }
}
