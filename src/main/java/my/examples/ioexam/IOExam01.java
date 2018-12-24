package my.examples.ioexam;

import java.io.File;

public class IOExam01 {
    public static void main(String[] args) {

//        //파일 체크
//        Files file1 = new Files("C:\\Users\\andrew\\Desktop\\fileio\\MyDesktop.txt");
//        if(file1.exists()){
//            System.out.println(file1.getName() + "파일이 존재합니다.");
//        }else{
//            System.out.println("파일이 없습니다.");
//        }

        //폴더체크
        //만약 폴더라면 폴더의 존재유무 출력
        //만약 파일이라면 파일의 존재유무 출력
        File file2 = new File("C:\\Users\\andrew\\Desktop\\fileio");
        if(file2.exists()){
            if(file2.isFile()){
                System.out.println("파일입니다.");
            }else if(file2.isDirectory()){
                System.out.println("폴더입니다.");
                File[] listOfFiles = file2.listFiles();

                for(File f : listOfFiles){
                    System.out.println(f.getName() + " , " + (f.isDirectory() ? "[DIR]" : "[FILE]" + f.length()));
                }

//                for (int i = 0; i < listOfFiles.length; i++) {
//                    if (listOfFiles[i].isFile()) {
//                        System.out.println("Files " + listOfFiles[i].getName() + "\n위치 : " +  listOfFiles[i].getPath() + "\n크기 : " + listOfFiles[i].length());
//                    } else if (listOfFiles[i].isDirectory()) {
//                        System.out.println("Directory " + listOfFiles[i].getName());
//                    }
//                }

            }
        }else{
            System.out.println("파일/폴더가 존재하지 않습니다. ");
        }

//        Files file3 = new Files("C:\\Users\\andrew\\Desktop\\fileio");
//        if(file3.isDirectory()){
//            System.out.println("폴더입니다.");
//        }else{
//            System.out.println("파일입니다");
//        }
//
//        //해당경로의 파일과 폴더들의 정보를 출력
//        Files folder = new Files("C:\\Users\\andrew\\Desktop\\fileio");
//        Files[] listOfFiles = folder.listFiles();
//
//        for (int i = 0; i < listOfFiles.length; i++) {
//            if (listOfFiles[i].isFile()) {
//                System.out.println("Files " + listOfFiles[i].getName() + "\n위치 : " +  listOfFiles[i].getPath() + "\n크기 : " + listOfFiles[i].length());
//            } else if (listOfFiles[i].isDirectory()) {
//                System.out.println("Directory " + listOfFiles[i].getName());
//            }
//        }

    }
}
