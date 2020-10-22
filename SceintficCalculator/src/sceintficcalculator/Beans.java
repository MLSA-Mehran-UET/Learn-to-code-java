/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sceintficcalculator;

import java.util.ArrayList;

public class Beans {
    String name;
    int date;
    ArrayList<String> list;
   
    public Beans(String name, int date, ArrayList<String> List) {
        this.name = name;
        this.date =date;
    }
    public String getName(){
return name;
    }
    public int getDate(){
return date;
    }

    @Override
    public String toString() {
        return "Beans{" + "name=" + name + ", date=" + date + ", list=" + list + '}';
    }

    
    
}
