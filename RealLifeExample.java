/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reallifeecample;

class Person
{
    String name;
    int id;
    Person (String name, int id)
    {
        this.id=id;
        this.name=name;
    }
}
class Emp extends Person
{
    double salary;
    Emp (String name, int id, double salary)
    {
        super(name,id);
        this.salary=salary;
    }
    void display()
    {
        System.out.println("id: "+id+", name: "+name+", salary: "+salary);
    }
}
public class RealLifeExample {
    static public void main (String[] args)
    {
        Emp obj=new Emp("Ahsan",26,100000.0);
        obj.display();
    }
}
