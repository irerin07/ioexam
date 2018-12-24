package my.examples.ioexam;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class FileData {
    List<File> file;

    public FileData(){
        file = new ArrayList<>();
    }

    public List<File> getFile() {
        return file;
    }

    public void setFile(List<File> file) {
        this.file = file;
    }

    public void addFile(File file){
        this.file.add(file);
    }

    public void addFolder(File file){
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isFile()){
                addFile(f);
            }else if(f.isDirectory()){
                addFolder(f);
            }
        }

    }

    @Override
    public String toString() {
        return "FileData{" +
                "file=" + file +
                '}';
    }
}
