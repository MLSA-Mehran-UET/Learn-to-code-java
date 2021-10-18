/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaString;

/**
 *
 * @author Saqib Ghouri
 */
public class StringFunctions {
    public static void main(String args[]){
    String name="Saqib";//creating String using Sting literal.
    char[] uname={'S','a','q','i','b'};//character array 
    String u_name=new String(uname);//representing character sequence as string
    String u_pass=new String("f16cs08");//nonpool string (memory is created in heap)
    String u_passd="f16cs08";//string literal
    String dname="Saqib";//String literal with same reference in string memory pool
   String cname="SAQIB";
    //String equals function    
    System.out.println(" "+name+" "+uname+" "+u_name+" "+u_pass+" "+dname);
        System.out.println(" "+name.equals(dname));//true
        System.out.println(" "+name.equals(uname));//false
        System.out.println(" "+name.equals(u_name));//true
        System.out.println(" "+u_pass.equals(u_passd));//true
        System.out.println(" "+name.equals(cname));//false
      //String compareTo() Function  
        System.out.println(" "+name.compareTo(dname));//equal
        System.out.println(" "+name.compareTo(u_name));//equal
        System.out.println(" "+name.compareTo(u_pass));//name<u_pass
       //'==' logical operater
        System.out.println(name == dname);//true
        System.out.println(name == u_name);//false
        System.out.println(u_pass == u_passd);//false
        System.out.println(name==cname);//false
        //String equalsIgnoreCase()
        System.out.println(" "+name.equalsIgnoreCase(cname));//true
        
        
        
        
        
        
        
        
    
    
    }
    
}
