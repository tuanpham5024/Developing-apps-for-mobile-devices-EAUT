package com.company.io;

import com.company.model.Customer;

import java.io.*;
import java.util.ArrayList;

public class SerialzeFileFactory {
    public static boolean saveFile(ArrayList<Customer> dsKH, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dsKH);
            oos.close();
            fos.close();

            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public static ArrayList<Customer> readFile(String path) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            customers = (ArrayList<Customer>) data;
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return customers;

    }
}
