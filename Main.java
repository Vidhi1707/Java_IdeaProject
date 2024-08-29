package com.javaactivity;

public class Main{

    public static void main(String[] args){
        //our first program
        System.out.println("Hello JAVA");
        System.out.println("HEY HOW ARE YOU");

        // Variable
        String name = "AMAN";
        int age = 30;
        String neighbour = "AKKU";
        String friend = neighbour;

        //PRIMITIVE VARIABLE (Length fixed)
        byte agee = 40;
        int phone =1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true;

        //print statement

        System.out.println("name.string()");

        //NON PRIMITIVE(Length Not Fixed)
        String name1 ="Shubh";
        String name2 ="Ashish";
        String name3 =name1 +" and " +name2;
        System.out.println(name3);

        //Strings
        //charAt
        String name5 ="Quarishma";
        System.out.println(name5.charAt(1));

        System.out.println(name5.length());
        //replace
        String name6 = "Siddharth";
        System.out.println(name6);
        String name7 = name6.replace('d','a') ;
        System.out.println(name7);

        //SUBSTRING

        String name8 = "Aman and Akku";
        System.out.println(name8.substring(4, 12));

        //Strings are Immutable



















    }
}