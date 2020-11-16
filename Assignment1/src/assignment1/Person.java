/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Scanner;
/**
 *
 * @author Tony
 */
public class Person {
   Scanner input = new Scanner(System.in);
   String firstName = new String(); 
   String lastName = new String(); 
   int age;
    String getFirstName(){
       return firstName; 
   }
   String getLastName(){
       return lastName; 
   }
   int getAge(){
       return age; 
   }
   void setFirstName(String value){
    firstName=value;
   }
   void setLastName(String value){
   lastName=value;
   }
   void setAge(int value){
   if(value<0||value>100){
     age = 0;
    }
   else{
   age = value;
   }
   }
   boolean isTeen(){
       return age>12&&age<20;
   }
   String getFullName(){
       if("".equals(firstName)){
        if("".equals(lastName)){
         return "";
        }
        else{
         return lastName;
        }
       }else{
          if("".equals(lastName)){
           return firstName;
          }else{
          return firstName+" "+lastName;
          }
       }
    
   }
   
}
