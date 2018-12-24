//package my.examples.ioexam;
//
//import java.io.Files;
//
//public class recursionFolder {
//    public void listFiles(String path) {
//        Files file = new Files(path);
//        Files[] listOfFiles = file.listFiles();
//        for(Files f : listOfFiles){
//            System.out.println(f.getName() + " , " + (f.isDirectory() ? "[DIR]" : "[FILE]" + f.length()));
//            if(f.isDirectory()){
//                listFiles(f.getPath());
//            }
//        }
//    }
//}
