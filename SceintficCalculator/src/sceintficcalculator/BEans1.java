/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sceintficcalculator;

import java.util.ArrayList;

/**
 *
 * @author Sameer
 */
public class BEans1 {
    public static void main(String args[]){  
      ArrayList<String> list1=new ArrayList<String>();  
      list1.add("sam");
      //ArrayList<String> list2=new ArrayList<String>();  
     // list2.add("ali");
      //ArrayList<String> list3=new ArrayList<String>();  
      //list3.add("khan");
      //ArrayList<String> list4=new ArrayList<String>();  
      //l//ist4.add("shaikh");
      //ArrayList<String> list5=new ArrayList<String>();  
      //list5.add("yousuf ");
     // ArrayList<String> list6=new ArrayList<String>();  
     // list6.add("faizan");
      
      Beans a=new Beans("SAm", 2019,list1);
      
      
      
      
        System.out.println(a.getName() + " "+ a.getDate() + a.list);
}}

