package com.javaactivity;

import java.util.Arrays;
import java.util.Scanner;
public class Take_Input
{
    public static void main(String[] args){
        //How To Take Input?
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Your Age : ");
        int age = sc.nextInt();
        System.out.println(age);
        //Take input as String
        //Takes input for the first word only
        Scanner s = new Scanner(System.in);
        System.out.println("Input Your Name:  ");
        String name = s.next();
        System.out.println(name);
        //Use function Line to print the whole sentence
        Scanner s2 = new Scanner(System.in);
        System.out.println("Input a Sentence ");
        String name2= s2.nextLine();
        System.out.println(name2);

}

        }