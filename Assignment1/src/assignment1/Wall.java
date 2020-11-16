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
public class Wall {
       double width;
       double height;
 Wall(double width, double height){
           if (width<0){
            width = 0;
           }else{
           }
           if (height<0){
            height = 0;
           }else{
           }
 }
       double getWidth(){
           return width;
       }
       double getHeight(){
           return height;
       }
       void setWidth(double value){
           if(width==0){
           width =0;
           }
           width=value;
       }
       void setHeight(double value){
           if(height==0){
           height = 0;
           }else{
           height=value;
           }
       }
       double getArea(){
        return width*height;
       }
    
    
       
}
