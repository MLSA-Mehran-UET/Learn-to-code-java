/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;





/**
 *
 * @author Sameer
 */
public class get {

    public static void main(String[] args) {
        set a=new set();
       a.setEmploye_Whourse(8);
       a.setEmploye_id(10);
       a.setEmploye_name("Samer");
      a.setEmploye_salary(5000);
      System.out.println("employee detail is");
        System.out.println(""+a.getEmploye_name());
        System.out.println(""+a.getEmploye_Whourse());
        System.out.println(""+a.getEmploye_id());
        System.out.println(""+a.getEmploye_salary());
    }
}