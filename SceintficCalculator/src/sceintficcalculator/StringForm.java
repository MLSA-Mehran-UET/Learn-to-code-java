package sceintficcalculator;
import java.util.Scanner;
public class StringForm {
public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your name max length 6 ");
        String a=sc.next();
        if (a.length()==6 ){
        System.out.println("Name length is valid " + "Your name is " + a.toUpperCase());}
        else {
        System.out.println(" Name length is Invalid");
        } 
        System.out.println("Enter your  password max length 8 ");
        String b=sc.next();
        if (b.length()==8){
       System.out.println("Password length is valid");}
        else {
                System.out.println("Password length is invalid");
        }
          System.out.println("Enter your email For Eg abc@.com");
          String c=sc.next();
          if (c.contains("@") && c.endsWith(".com")){
        System.out.println("your mail is correct format");}
        else
        System.out.println("your mail is incorrect format");        
        System.out.println("Enter your Nic number in Correct Format");
          String d=sc.next();
          if (d.contains("-") && d.length()==15){
              System.out.println("NIC is valid");}
              else {
              System.out.println("Nic is invalid");}
          
    System.out.println("Enter your Phone Number");
    String g=sc.next();
    if (g.startsWith("033")){
        System.out.println("Phone Number Format is Valid");}
    else {
        System.out.println("Phone Number Format is valid");
          }}}
    