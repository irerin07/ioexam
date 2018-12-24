package my.examples.ioexam;

import java.io.File;

public class IOExam02 {
    public static void main(String[] args) {
        //recursionFolder rc = new recursionFolder();
        File file2 = new File("C:\\Users\\andrew\\Desktop\\fileio");
        if (file2.exists()) {
            if (file2.isFile()) {
                System.out.println("파일입니다.");
            } else if (file2.isDirectory()) {
                System.out.println("폴더입니다.");
                IOExam02.listFiles(file2.getPath());
            }
        } else {
            System.out.println("파일/폴더가 존재하지 않습니다. ");
        }
    }

    public static void listFiles(String path) {
        File file = new File(path);
        File[] listOfFiles = file.listFiles();
        for (File f : listOfFiles) {
            System.out.println(f.getName() + " , " + (f.isDirectory() ? "[DIR]" + f.getPath(): "[FILE]" + f.getPath() + f.length()));
            if (f.isDirectory()) {
                listFiles(f.getPath());
            }
        }
    }
}
