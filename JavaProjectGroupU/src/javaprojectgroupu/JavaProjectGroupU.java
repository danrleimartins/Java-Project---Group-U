/*
 Module: Time & Task Management
CA2 - Collaborating with Technology
Lecturer: John Snel
authors: Danrlei da Silva Martins, Oséas Filho, Guilherme Oliveira, Michel Tormes and Aline Roberta Leão
 */
package javaprojectgroupu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaProjectGroupU {

    static void DanrleiMethod() {
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

            System.out.println(input1 + " multiplied by " + input2 + " is " + multiply);

        } catch (Exception e) {
            System.out.println("Invalid input, please enter only numbers");

        }

    }

       static void GuilhermeMethod() {
        /*
        author: Guilherme Oliveira
        method: Division
<<<<<<< HEAD
        */
       
=======
         */
        
>>>>>>> 0dbc3f3d638d98bed6bf34a8da56866d82c4f8ee
        try {
            BufferedReader myKb = new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Please, enter a number");
                 float input = Float.parseFloat(myKb.readLine());

                 System.out.println("Please, enter a second number");
                 float input2 = Float.parseFloat(myKb.readLine()) ;
                 
                 if (input2 == 0) {

                 System.out.println("Error!");
                 } else {
                 System.out.println("The first number divided by the second number is " + input / input2);
                 
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }        
    }


    static void OseasMethod() {
        /*
        * Author: Oséas Filho
        * Method: Sum
         */

        int num1, num2, sum;

        try {
            Scanner myKb = new Scanner(System.in);

            System.out.println("Please, enter a number.");
            num1 = Integer.parseInt(myKb.nextLine());

            System.out.println("Please, enter a second number.");
            num2 = Integer.parseInt(myKb.nextLine());

            sum = num1 + num2;

            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        } catch (Exception e) {

            System.out.println("Sorry, only integers allowed.");

        }
    }
    
    static void AlineMethod(){
        
          /*
        * Author: Aline Roberta Leao
        * Method: Subtraction
        */
        
        int a, l, total;
        Scanner myKb = new Scanner(System.in);
            
        try {
            
            
            System.out.println("Please, enter a number.");
        a = Integer.parseInt(myKb.nextLine());
            
            System.out.println("Please, enter a second number.");
        l = Integer.parseInt(myKb.nextLine());
            
            total = a - l;
            
            System.out.println("If you subtracted the second number of the first number is: " + total + ".");
        }
        
        catch(Exception e){
            
            System.out.println("Sorry, only integers allowed.");
        
        }
        
        
    }
    
    static void MichelMethod() {
        /* 
        * Author: Michel Tormes
        * Method: Print
     */
        String CSI = "\u001B[";
        System.out.print(CSI + "32" + "m");

        System.out.println("This is the group U calculator.");
        System.out.println("Thanks for your preference!");
        System.out.println(CSI + "m");

    }


    public static void main(String[] args) {

<<<<<<< HEAD
               
        DanrleiMethod();
        GuilhermeMethod();        
=======
        System.out.println("Welcome to the Java Calculator of Group U - Unity");
        
        System.out.println("Multiplication");
        DanrleiMethod();
        
        System.out.println("Division");
        GuilhermeMethod();
        
        System.out.println("Summation");
>>>>>>> 0dbc3f3d638d98bed6bf34a8da56866d82c4f8ee
        OseasMethod();
        
        System.out.println("Subtraction");
        AlineMethod();
        
        MichelMethod();

    }

}
