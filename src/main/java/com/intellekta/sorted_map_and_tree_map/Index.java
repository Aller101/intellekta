/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.sorted_map_and_tree_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author alekseynesterov
 */
public class Index {

    public static void main(String[] args) {
        
        Index index = new Index("Проворонила ворона вороненка, проворонила ворона воронят");
        System.out.println(index.getFrequencyTable());
        System.out.println(index.getWordFrequency("проворонила"));
        index.appendText("Ворона еще раз проворонила.");
        System.out.println(index.getFrequencyTable());
    }

    private SortedMap<String, Integer> table;

    public Index() {
        table = new TreeMap<>();
    }

    public Index(String text) {
        if (table == null) {
            table = new TreeMap<>();
            appendText(text);
        } else {
            appendText(text);
        }
    }

    public int getWordFrequency(String word) {
        Integer number = table.get(word);
        if (number == null) {
            return 0;
        } else {
            return number;
        }
    }

    public void appendText(String text) {
        //приводим к нижн. рег. до разбиения
        List<String> words = Arrays.stream(text.toLowerCase()
                .replaceAll("\\p{Punct}", "")
                .split("\\s+"))
                .collect(Collectors.toList());

        for (String word : words) {
            //метод getOrDefault(Object key, V defaultValue)
            //возвр. знач. "key" есди есть этот ключ в мапе
            //если не сущ. - возвращ. "0"
            table.put(word, table.getOrDefault(word, 0) + 1);
        }
    }

    public SortedMap<String, Integer> getFrequencyTable() {
        return this.table;
    }

}
