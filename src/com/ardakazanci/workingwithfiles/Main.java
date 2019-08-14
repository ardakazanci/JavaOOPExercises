package com.ardakazanci.workingwithfiles;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        readFile();
        writingFile();
        readFile();


    }

    private static void createFile() {
        File file = new File("/Users/ardakazanci/Desktop/JavaOOPExercises/files/personel.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("İlgili dosya oluşturuldu.");
            } else {
                System.out.println("İlgili dosya zaten var.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getFileInfo() {
        File file = new File("/Users/ardakazanci/Desktop/JavaOOPExercises/files/students.txt");
        if (file.exists()) {
            System.out.println("Dosya Adı " + file.getName());
            System.out.println("Dosya Yolu " + file.getAbsolutePath());
            System.out.println("Dosya Yazılabilir mi? " + file.canWrite());
            System.out.println("Dosya Boyutu " + file.length() + " Byte");
        }


    }

    // BufferedReader - Önce dosyayı belleğe alır, bellek üzerinde işlem yapmaktadır.

    // Belleğe almadan işlem yapacağız.

    private static void readFile() {
        File file = new File("/Users/ardakazanci/Desktop/JavaOOPExercises/files/students.txt");
        try {
            Scanner reader = new Scanner(file);
            /**
             * hasNextLine -> Satır okuma işlemi , okunacak satır bitene kadar devam edecektir.
             */
            while (reader.hasNextLine()) {
                /**
                 * nextLine -> Okunacak satır var mı ? Kontrolü sağlıyor. Satır bittiyse while false ' a dönüyor.
                 */
                String line = reader.nextLine();
                System.out.println(line);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void writingFile() {
        try {

            // append değerini true verilirse üstüne yazma işlemi gerçekleşmez.
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/ardakazanci/Desktop/JavaOOPExercises/files/students.txt", true));
            writer.newLine(); // yeni satır oluştur.
            writer.write("Aslı Bom");
            System.out.println("Dosyaya yazma işlemi tamamlandı.");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
