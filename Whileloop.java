package com.javaactivity;

import java.util.Scanner;
public class Whileloop {

    public static void main(String [] args) {
        //Loops
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do{
            System.out.print("Input A Number : ");
            number = sc.nextInt();
            System.out.print("Here is your number : ");
            System.out.println(number); //Both in same line
        } while(number >=0 );

        System.out.println("THE END");

    }

}
