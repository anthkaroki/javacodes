package com.karoki;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File CodeFiles = new File("CodeFiles");
        CodeFiles.mkdir();

        File accounts = new File("CodeFiles\\AllAccounts.txt");
        accounts.createNewFile();
        System.out.println("\'accounts\' file was created.");

        BufferedWriter bw = new BufferedWriter(new FileWriter(accounts));
        bw.write("Joan");
        bw.newLine();
        bw.write("Erykah");
        bw.newLine();
        bw.write("Andrew");
        bw.newLine();
        bw.write("Alex");
        bw.newLine();
        bw.write("Rosalynn");
       bw.close();
    }
}
