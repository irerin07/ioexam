package my.examples.ioexam;

import java.io.File;

public class FileExam {
    public static void main(String[] args) {
        FileData fd = new FileData();
        java.io.File file = new File("C:\\Users\\andrew\\Desktop\\fileio");
        if(file.exists()){
            File[] files = file.listFiles();
            for(File file1 : files){
                if(file.isFile()){
                    fd.addFile(file1);
                }else if(file.isDirectory()){
                    fd.addFolder(file1);
                }
            }
        }
        fd.toString();


    }
}
