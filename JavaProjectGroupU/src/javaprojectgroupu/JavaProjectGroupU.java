/*
 Module: Time & Task Management
CA2 - 
Lecturer: John Snel
authors: Danrlei da Silva Martins, Oséas Filho, Guilherme Oliveira
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
        */
       
        try {
            BufferedReader myKb = new BufferedReader(new InputStreamReader(System.in));

                 System.out.println("Please, enter a number");
                 double number = Double.parseDouble(myKb.readLine());

                 System.out.println("Please, enter a second number");
                 double number2 = Double.parseDouble(myKb.readLine()) ;

                 if (number2 == 0) {

                 System.out.println("Error!");
                 } else {

                 System.out.println("The first number divided by the second number is " + (number / number2));

            }
        } catch (Exception e) {
            System.out.println("Error!");
        }        
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

    static void MichelMethod() {
        /* 
        * Author: Michel Tormes
        * Method: Lff
     */
        String CSI = "\u001B[";
        System.out.print(CSI + "32" + "m");

        System.out.println("This is the group U calculator");
        System.out.println("Thanks for your preference");
        System.out.println(CSI + "m");

    }

    public static void main(String[] args) {



        DanrleiMethod();
        GuilhermeMethod();
        OseasMethod();
        MichelMethod();

    }

}
