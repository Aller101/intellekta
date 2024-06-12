/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alekseynesterov
 */
public class ImportNotesFromFileToList {

    public static String path = "src/main/java/com/intellekta/exceptions/Notes.txt";

    public static ArrayList<String> readNotesToList(String path) {
        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = reader.readLine()) != null) {
                list.add(line);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Process finished");
        }

        return list;
    }

    public static void writeCommentToNotes(String path) {
        Scanner scanner = null;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {

            scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if (!s.isEmpty()) {
                writer.write("#" + s);
                writer.newLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("Access denied");
            ex.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("Process finished");
        }
    }

//    public static void main(String[] args) {
//        writeCommentToNotes(path);
//        ArrayList<String> list = readNotesToList(path);
//        for(String s:list){
//        System.out.println(s);
//        }
//    }

}
