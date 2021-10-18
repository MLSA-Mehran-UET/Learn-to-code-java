/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntanceInitializerBlock;

/**
 *
 * @author Saqib Ghouri
 */
public class IntanceInitailizerBlock {
    {
        System.out.println("IntanceInitializerBlock");
        
    }
static{
    System.out.println("Static IntanceInitializerBlock");
}
    
    public IntanceInitailizerBlock() {
        System.out.println("IntanceInitializerBlock Constructor");
    }
    {
        System.out.println("IntanceInitializerBlock after constructor");
    }
    
    IntanceInitailizerBlock(int a){
        System.out.println("IntanceInitializerBlock Contstructor 1 "+a);
    }
}
class IntanceCheck{
    public static void main(String args[]){
    IntanceInitailizerBlock i=new IntanceInitailizerBlock();
    IntanceInitailizerBlock j=new IntanceInitailizerBlock(6);
    

    }
}

