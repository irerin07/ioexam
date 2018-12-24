package my.examples.ioexam;

import java.io.File;

public class FileRecursionMyExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\andrew\\Desktop\\fileio");
        if(file.exists()){
            File[] fileList = file.listFiles();
            for(File file1 : fileList){
                if(file1.isFile()){
                    printFile(file1);
                }else if(file1.isDirectory()){
                    printDir(file1);
                }
            }
        }
    }

    public static void printFile(File file){
        System.out.println("[Files]" + file.getName());

    }
    public static void printDir(File file){
        System.out.println("[DIR]" + file.getName());
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isFile()){
                printFile(f);
            }else if(file.isDirectory()){
                printDir(f);
            }
        }


    }
}
