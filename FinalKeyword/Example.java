/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalKeyword;

/**
 *
 * @author Saqib Ghouri
 */
public class Example {
    int speedLimit=200;//intance variable
   final int  speedLimitFinal=250;//final instance variable
   final int blankSpeedLimit;//final blank intance variable
   {
    blankSpeedLimit=300;
   }

    public Example() {
        //speedLimitFinal=300;
        speedLimit=300;
        
    }
    final void example(){
        final int speed=100;
        
    }
    void example(final int speed){
        System.out.println(" "+speed);
    }
   
    
    
}
class child extends Example{
//void example(){
//
//}
    public static void main(String args){
  Example e=new Example();
     //speedLimit=300;  
  
    }
   
  
    
}
