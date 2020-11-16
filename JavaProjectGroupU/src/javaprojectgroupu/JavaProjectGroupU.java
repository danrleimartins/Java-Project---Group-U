/*
 Module: Time & Task Management
CA2 - 
Lecturer: John Snel
authors: Danrlei da Silva Martins, Oséas Filho, Guilherme Oliveira
 */
package javaprojectgroupu;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class JavaProjectGroupU {
    
    static void DanrleiMethod(){
        /*
        author: Danrlei Martins
        method: Multiply
        */
        
        int input1, input2, multiply;
        
        try {
            BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
        
            System.out.println("Please enter a number");
            input1 = Integer.parseInt(myKB.readLine());
            
            System.out.println("Please enter another number");
            input2 = Integer.parseInt(myKB.readLine());
            
            multiply = input1 * input2;
            
            System.out.println(input1 +  " multiplied by " + input2 + " is " + multiply);
            
        }
        catch (Exception e){
            
        }
        
    }

    
    public static void main(String[] args) {
        
        DanrleiMethod();
    }
    
}
