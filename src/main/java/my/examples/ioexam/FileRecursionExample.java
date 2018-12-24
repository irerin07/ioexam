package my.examples.ioexam;

import java.io.File;

public class FileRecursionExample {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\andrew\\Desktop\\fileio");
        if (file.exists()) {
            File[] files = file.listFiles();
            for(File file1 : files) {
                if (file1.isFile()) {
                    printFile("", file1);
                } else {
                    printDir("", file1);
                }
            }
        }
    }

    public static void printFile(String space, File file) {
        System.out.println(space + file.getName());
    }

    public static void printDir(String space, File file) {
        System.out.println(space + file.getName() + "[DIR]");
        space = space + "     ";
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                printFile(space, f);
            } else {
                printDir(space, f);
            }
        }
    }
}

