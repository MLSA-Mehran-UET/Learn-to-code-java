/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

/**
 *
 * @author Saqib Ghouri
 */
public class Aggregation {
String owner,name,company;
int number,power,price;
public void carDetail(String owner,String name,String company,int number,int power,int price){
    this.owner=owner;
    this.name=name;
    this.company=company;
    this.number=number;
    this.power=power;
    this.price=price;
}
}
class EmplyeeCarDetals{
    Aggregation carDetail;
    String ownerName;
public void employeeCarDetail(String ownerName,Aggregation carDetail){
    this.ownerName=ownerName;
    this.carDetail=carDetail;
}
public void display(){
    System.out.println("Owner Name: "+ownerName);
    System.out.println("Car Detail:\n Name:"+carDetail.name+"\n Company: "+carDetail.company+"\n Power: " +carDetail.power
    +"\n Price: "+carDetail.price
    );
    
    
}
public static void main(String args[]){
Aggregation owner1=new Aggregation();
Aggregation owner2=new Aggregation();

owner1.carDetail("Saqib", "Accord", "Homda", 675, 2000, 4500000);
owner2.carDetail("Ahsan", "City", "Honda", 678, 1300, 2400000);
 
    EmplyeeCarDetals e1=new EmplyeeCarDetals();
    EmplyeeCarDetals e2=new EmplyeeCarDetals();
    e1.employeeCarDetail("Saqib", owner1);
    e2.employeeCarDetail("Ahsan", owner2);
    e1.display();
    e2.display();

}

}
