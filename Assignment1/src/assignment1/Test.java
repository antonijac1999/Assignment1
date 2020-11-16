/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Tony
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //person
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("Full Name is "+person.getFirstName());
        System.out.println("Teen? "+person.isTeen());
        person.setFirstName("Antoni");
        person.setAge(20);
        System.out.println("Full Name " +person.getFullName());
        System.out.println("teen? "+person.isTeen());
        person.setLastName("Kay");
        System.out.println("Full Name " +person.getFullName());
        // calculator
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(7.8);
        calculator.setSecondNumber(9);
        System.out.println("add: "+calculator.getadditionresult());
        System.out.println("subtract: "+calculator.getsubtractionresult());
        calculator.setFirstNumber(7.8);
        calculator.setSecondNumber(0);
        System.out.println("multiply: "+calculator.getmultiplicationresult());
        System.out.println("divide: "+calculator.getdivisionresult());
        
        Wall wall=new Wall(6,9);
        System.out.println("area: " + wall.getArea());
        wall.setHeight(-3);
        System.out.println("width: "+wall.getWidth());
        System.out.println("height: "+wall.getHeight());
        System.out.println("area: "+wall.getArea());
        
        
    }
    
}
