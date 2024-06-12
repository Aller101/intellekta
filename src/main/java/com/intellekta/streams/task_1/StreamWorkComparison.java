package com.intellekta.streams.task_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alekseynesterov
 */
public class StreamWorkComparison {

    public static String path = "src/main/java/com/intellekta/streams/task_1/Notes.txt";

    public static long checkFileReaderWork(String file) {

        long startTime = System.currentTimeMillis();
        long finishTime = 0;

        try (FileReader reader = new FileReader(file)) {
            int i;
            while ((i = reader.read()) != -1) {
//                System.out.print(i);
            }

        } catch (FileNotFoundException ex) {
            return -1;
        } catch (IOException ex) {
            ex.printStackTrace();
            return -1;
        }
        finishTime = System.currentTimeMillis();
        return finishTime - startTime;
    }

    public static long checkBufferedReaderWork(String file) {

        long startTime = System.currentTimeMillis();
        long finishTime = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null) {
//                System.out.print(str);
            }

        } catch (FileNotFoundException ex) {
            return -1;
        } catch (IOException ex) {
            ex.printStackTrace();
            return -1;
        }
        finishTime = System.currentTimeMillis();
        return finishTime - startTime;

    }

    public static long checkScannerWork(String file) {

        long startTime = System.currentTimeMillis();
        long finishTime = 0;

        try (Scanner scanner = new Scanner(new File(file))) {
            String str;
            while (scanner.hasNext()) {
                str = scanner.nextLine();
//                System.out.print(str);
            }

        } catch (FileNotFoundException ex) {
            return -1;
        } catch (IOException ex) {
            ex.printStackTrace();
            return -1;
        }
        finishTime = System.currentTimeMillis();
        return finishTime - startTime;

    }

    public static ArrayList<Map.Entry<String, Long>> compareReading(String file) {

        long checkFileReaderWork = checkFileReaderWork(file);
        long checkBufferedReaderWork = checkBufferedReaderWork(file);
        long checkScannerWork = checkScannerWork(file);

        ArrayList<Map.Entry<String, Long>> arrayList = new ArrayList<>();

        if (checkFileReaderWork != -1) {
            arrayList.add(new AbstractMap.SimpleEntry<>("checkFileReaderWork", checkFileReaderWork));
        }
        if (checkBufferedReaderWork != -1) {
            arrayList.add(new AbstractMap.SimpleEntry<>("checkBufferedReaderWork", checkBufferedReaderWork));
        }
        if (checkScannerWork != -1) {
            arrayList.add(new AbstractMap.SimpleEntry<>("checkScannerWork", checkScannerWork));
        }
        arrayList.sort(Map.Entry.comparingByValue());
        return arrayList;
    }

    public static void main(String[] args) {

        ArrayList<Map.Entry<String, Long>> arrayList = compareReading(path);

        for (Map.Entry<String, Long> map : arrayList) {
            System.out.println(map.getKey() + ": " + map.getValue() + " ms");
        }

    }
}
