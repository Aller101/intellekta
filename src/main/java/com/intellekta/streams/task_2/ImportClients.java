/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.streams.task_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author alekseynesterov
 */
public class ImportClients {

//    public static String path = "src/main/java/com/intellekta/streams/task_2/clients/";
    
    
    //считываем клиентов из txt и возвращаем список
    public static ArrayList<Client> createClients(String path) {
        File file = new File(path);
        System.out.println("");
        System.out.println(file);
        System.out.println("");

        ArrayList<Client> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path + "Clients.txt"))) {
            System.out.println("11");
            String str;
            while ((str = reader.readLine()) != null) {
                Client client = new Client(str);
                System.out.println(client);
                list.add(client);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        } catch (IOException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }

        return list;
    }

    //считываем клиентов из *out и возвращаем список
    public static ArrayList<Client> cardsToClients(String path) {

        int i = 0;
        ArrayList<Client> list = new ArrayList<>();

        File file = new File(path + "client" + i + ".out");
        
        //если есть есть такое название + является файлом = проходит дальше
        while (file.isFile()) {
            file = new File(path + "client" + i + ".out");
            //выходит из цикла если не является файлом
            if(!file.isFile()){
                System.out.println("clients: "+ i);
                break;
            }

            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path + "client" + i++ + ".out"))) {

                Client client = (Client) inputStream.readObject();
                if(client!=null){
                list.add(client);
                }else{
                    return new ArrayList<>();
                }

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                return new ArrayList<>();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
                return new ArrayList<>();
            } catch (IOException ex) {
                ex.printStackTrace();
                return new ArrayList<>();
            }
        }

        return list;

    }

    //создает файлы с расширением "out" - на вход список клиентов и путь к папке с файлами *out
    public static void cardsToClients(ArrayList<Client> list, String path) {

        int i = 0;

        for (Client client : list) {

            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path + "client" + i++ + ".out"))) {
                outputStream.writeObject(client);
                System.out.println("Done1!");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    public static void checkImport(ArrayList<Client> list) {
        if(list.isEmpty()){
            System.out.println("import failed");
            return;    
        }
        for(Client client:list){
            System.out.printf("%s, %s, %s, %s \n",client.getName()
                    ,client.getContactPerson().getName()
                    , client.getRequisite().get(0).getValue()
                    , client.getRequisite().get(1).getValue());
        }
//        System.out.println("<Наименование фирмы>, <Имя контактного лица>, <ИНН>, <ОКВЭД>");
    }

}
