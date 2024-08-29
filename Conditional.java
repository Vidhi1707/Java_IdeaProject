package com.javaactivity;
import java.util.Scanner;

public class Conditional {
    public static void main(String [] args)
    {
        //conditional Statements
        Scanner sc = new Scanner(System.in);
        //Pen = 10 ; notebook = 40
        System.out.println("Input Amount of Cash You Have : ");
        int cash = sc.nextInt();

        if(cash <= 10 ) {
            System.out.println("Cannot Buy Anything");
            System.out.println("Get more Cash");
        }
        else if(cash > 10 && cash < 50) {
            System.out.println("Can Get 1 Thing");
        }
        else
            System.out.println("Can Get Both");
    }

}
