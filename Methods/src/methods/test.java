/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.logging.Logger;

public class test {
    int i;
    String s; 
    double f; 
    int d;

    public int getD() {
        return d;
    }
    
    public int getI() {
        return i;
    }
    public String getS() {
        return s;
    }

    public double getF() {
   
        return f;
    }

    public void setD(int d) {
        this.d = d;
    }
    

    public void setI(int i) {
        this.i = i;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setF(double f) {
        this.f = f;
    }
    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }


    @Override
    public String toString() {
        return "test{" + "i=" + i + ", s=" + s + ", f=" + f + ", d=" + d + '}';
    }
    

   
    
}
