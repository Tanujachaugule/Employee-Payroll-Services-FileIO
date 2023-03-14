package com.employeepayroll;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public void createFile() throws IOException {
        File f = new File("C:\\Users\\ADMIN\\Desktop\\Json\\RFP.json");
        f.createNewFile();
        System.out.println(f.exists());
    }
    public void createDirectory() throws IOException {
        File f = new File("C:\\Users\\ADMIN\\Desktop\\Json\\RFP.json");
        f.mkdir();
        System.out.println(f.exists());
    }
    public void createFiles() throws IOException {
        for (int startNo = 5; startNo < 51; startNo++) {
            File f = new File("C:\\Users\\ADMIN\\Desktop\\Json\\RFP.json" + startNo + ".txt");
            f.createNewFile();
        }
    }
    public void checkFiles() {
        File f = new File("C:\\Users\\ADMIN\\Desktop\\Json\\RFP.json");
        String[] listFiles = f.list();
        for (String str : listFiles) {
            System.out.println(str);
        }
    }


    public static void main(String[] args) throws IOException {
        FileOperations fcObj = new FileOperations();
        fcObj.createFile();
        fcObj.createFiles();
        fcObj.checkFiles();
        fcObj.createDirectory();
    }
}
