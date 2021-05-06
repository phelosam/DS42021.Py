/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev4;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class DEVs4 {

    /**
     * @param args the command line arguments
     */
     static double input_length(){
    System.out.println("enter the length");
    Scanner y = new Scanner(System.in);
    double len = y.nextDouble();
    return len ;
     }
     static double input_width(){
    System.out.println("enter the width");
    Scanner y = new Scanner(System.in);
    double wid = y.nextDouble();
    return wid ;
     }
     static double cal(double len , double wid){
     double  per ;
     per = len * wid ;
     return per ;
     }
    
     static double calc(double len , double wid){
     double  area ;
     area = (0.5*wid)*len ;
     return area ;
     }
        
     
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = input_length();
        double b = input_width();
        double c = calc(a,b);
        double d = cal(a,b);
        System.out.println("your length is "+ a);
        System.out.println("your width is " + b);
        System.out.println("your area is " + c);
        System.out.println("your perimeter is "+ d);
        
    }
    
}
