/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;
public class interfac implements NewInterface{

    @Override
    public void sin(int a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("your sin value "+Math.sin(a));
    }
    @Override
    public void cos(int b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("your cos value "+Math.cos(b));
    }

    @Override
    public void tan(int c) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("your tan value"+Math.tan(c));
    }

    @Override
    public void sqrt(int d) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("your square root value"+Math.sqrt(d));
    }
    public static void main(String[] args) {
        interfac i=new interfac();
       // Scanner sc= Scanner (System.in);
        i.sin(10);
        i.cos(12);
        i.tan(12);
        i.sqrt(10);
    }
}
