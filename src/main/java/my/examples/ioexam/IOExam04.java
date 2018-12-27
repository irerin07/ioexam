package my.examples.ioexam;

import java.io.*;
import java.lang.reflect.Array;

public class IOExam04 {
    public static void main(String[] args) {

        byte ioExam[] = new byte[20];
        byte[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,-1,18,19,20};

        ByteArrayInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new ByteArrayInputStream(array);
            out = new FileOutputStream("bytearray.dat");
            int readData = 0;
            while((readData = in.read()) != -1){
                out.write(readData);
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

/*
    int readData = 0;
    while((readData = in.read()) != -1){
    out.write(readData);
    }

    readData를 정수형으로 저장 한 이유 ->
    배열의 중간에 -1이 있을 경우 while((in.read()) != -1)에서 while문이 중단이 된다.
    이런 경우를 방지 하기 위해서 readData를 정수형으로 선언 후 in.read()의 값을 저장 해 준다.
    바이트에서 맨 앞의 비트는 부호를 나타내는 부호비트로써 양수 혹은 음수인지를 나타낸다.
    readData는 인트형 즉 4바이트 크기이므로 맨 마지막 1바이트에 숫자를 저장해주면
    나머지 3바이트에는 0만 저장 되므로 항상 양수를 나타낸다.
    즉, 배열 중간에 -1이 있다고 하더라도 while문이 중단이 되지 않고 계속 진행이 된다.
 */
