package com.vdishub.simplerecyclerviewexample;

/**
 * Created by vdishub.
 * Date: 3/9/18
 * Time: 3:16 PM
 *
 * @author Manish rawat
 */
public class Contact {
    String name;
    String number;

    public Contact( String name,String number){
        this.name=name;
        this.number=number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
