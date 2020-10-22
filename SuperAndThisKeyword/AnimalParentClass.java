/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperAndThisKeyword;

/**
 *
 * @author Saqib Ghouri
 */
public class AnimalParentClass {

    AnimalParentClass() {
        System.out.println("This is animal parent class");
    }
    
    
}
class ChildAnimal extends AnimalParentClass{

    ChildAnimal() {
   super();
   
    }

   

}
