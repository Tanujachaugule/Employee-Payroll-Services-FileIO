package com.employeePayrollservices;

import java.io.File;
import java.io.IOException;

public class OperationsOnFile {
    public void createFile() throws IOException {
        File file = new File("C:\\Users\\ADMIN\\Desktop\\Json\\RFP.json");
        file.createNewFile();
        System.out.println(file.exists());
    }
    public void createDirectory() throws IOException {
        File file = new File("C:\\Users\\ADMIN\\Desktop\\Json\\RFP.json");
        file.mkdir();
        System.out.println(file.exists());
    }
    public void createFiles() throws IOException {
        for (int startNo = 5; startNo < 51; startNo++) {
            File file = new File("C:\\Users\\ADMIN\\Desktop\\Json\\RFP.json" + startNo + ".txt");
            file.createNewFile();
        }
    }
    public void checkFiles() {
        File file = new File("C:\\Users\\ADMIN\\Desktop\\Json\\RFP.json");
        String[] listFiles = file.list();
        for (String str : listFiles) {
            System.out.println(str);
        }
    }
    public void deleteFiles(){
        File file = new File("C:\\Users\\ADMIN\\Desktop\\Json\\RFP.json");
        if(file.delete()){
            System.out.println("File Deleted");
        }
    }


    public static void main(String[] args) throws IOException {
        OperationsOnFile fileObj = new OperationsOnFile();
        fileObj.createFile();
        fileObj.createFiles();
        fileObj.checkFiles();
        fileObj.createDirectory();
        fileObj.deleteFiles();
    }
}


