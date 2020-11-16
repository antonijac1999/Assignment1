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
public class SimpleCalculator {
    double firstNumber;
    double secondNumber; 
    double getFirstNumber(){
        return firstNumber;
    }
    double getSecondNumber(){
        return secondNumber;
    }
    void setFirstNumber(double value){
        value = firstNumber;
    }
    void setSecondNumber(double value){
        value = secondNumber;
    }
    double getadditionresult(){
        return firstNumber+secondNumber;
    }
    double getsubtractionresult(){
        return firstNumber-secondNumber;
    }
    double getmultiplicationresult(){
        return firstNumber*secondNumber;
    }
    double getdivisionresult(){
        if (secondNumber==0){
        return 0;
        }else{
        return firstNumber/secondNumber;
        }
    }
}
