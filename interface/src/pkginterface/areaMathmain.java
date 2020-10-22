/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Sameer
 */
public class areaMathmain implements areaVolume,mathfun {

    @Override
    public void area(int length, int width) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int c=(length*width);
        System.out.println("your area is "+c);
    }

    @Override
    public void vol(int length, int width, int height) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   int c=(length*width*height);
        System.out.println("your volume is "+c);
    }

    @Override
    public void add(int a, int b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("your addition is "+(a+b));
    }

    @Override
    public void sub(int a, int b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
System.out.println("your subtraction is "+(a-b));
    }

    @Override
    public void multi(int a, int b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("your Multiplication is "+(a*b));
    }

    @Override
    public void div(int a, int b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("your Division is "+(a/b));
    }
    
}
