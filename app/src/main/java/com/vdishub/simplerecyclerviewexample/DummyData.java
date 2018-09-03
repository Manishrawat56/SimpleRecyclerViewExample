package com.vdishub.simplerecyclerviewexample;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by vdishub.
 * Date: 3/9/18
 * Time: 3:54 PM
 *
 * @author Manish rawat
 */
public class DummyData {
    public static ArrayList<Contact> getData(){
        String[] name=new String[]{
                "Jay","Prashant","Abhay","Arti","Suraj","Akshay","Devendra","Priya","Jay","Prashant","Abhay","Arti","Suraj","Akshay","Devendra","Priya"
        };
        ArrayList<Contact> contacts=new ArrayList<>();
        Random random=new Random();
        for (int i=0;i <name.length;i++){
            Contact contact=new Contact(name[i],"9899"+(random.nextInt(999999)+100000));
            contacts.add(contact);
        }
        return contacts;
    }
}
