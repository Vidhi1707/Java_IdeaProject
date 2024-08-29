package com.javaactivity;
import java.util.Scanner;

public class Mini_Project {
    public static void main(String[] args) {
        //Mini Project
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess My Number (0-100) : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber) {
               System.out.println("WooHoo .. CORRECT NUMBER ");
               break;
            }
         else if(userNumber > myNumber) {
                System.out.println("Your Number is Too Large");
            }
         else{
             System.out.println("Your Number is Too Small");
            }
        }while(userNumber >= 0);
        System.out.println("My Number Was : ");
        System.out.println(myNumber);
    }
}
