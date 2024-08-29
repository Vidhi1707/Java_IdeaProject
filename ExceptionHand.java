package com.javaactivity;

public class ExceptionHand {
    public static void main(String [] args) {

        //TRY - CATCH in Exception Handling
        int[] marks = { 97, 98, 95};
        try {
        System.out.println(marks[5]);
        }
        catch(Exception exception) {
            //do something after catching
        }

        System.out.println("This is Exception HANDLING");

    }

}
