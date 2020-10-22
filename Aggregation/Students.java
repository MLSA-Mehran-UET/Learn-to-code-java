/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

/**
 *
 * @author Ahsan Qadeer
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Students {
int rollno;
    String name;
    Address address;
    
    public Students(int rollno, String name, Address address)
    {
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }
    
    void display()
    {
        System.out.println("Student Roll no: "+rollno);
        System.out.println("Student name: "+name);
        System.out.println("Student Address: "+address.city+", "+address.province+", "+address.country+".");
    }
    
    public static void main(String args[])
    {
        Address address1 =new Address("Hyderabad","Sindh","Pakistan");
        Address address2 =new Address("Karachi","Sindh","Pakistan");
        
        Students student1=new Students(26,"Ahsan Qadeer",address1);
        Students student2=new Students(28,"Asim Rauf",address2);
        
        student1.display();
        student2.display();
      
    }    
}
