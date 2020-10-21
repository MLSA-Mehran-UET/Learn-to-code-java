/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntanceOfVariable;

/**
 *
 * @author Saqib Ghouri
 */
public class IntanceOfVariable {
    public static String a;
    static{
       a="1";
    }
    
    public static void main(String args[])
    {
        System.out.println(" "+a instanceof String); 
    }
    
}
