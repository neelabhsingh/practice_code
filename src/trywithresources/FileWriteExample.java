package trywithresources;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\NEELABH SINGH\\Documents\\TestFile.txt";
        String content = "This is some content to write to the file.";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
            bw.write(content);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
