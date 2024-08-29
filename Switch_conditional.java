package com.javaactivity;

public class Switch_conditional {

    public static void main(String[] args)
    {
        //Conditional Statements - SWITCH
        int day = 2; // 1 -monday ; 2- tuesday
        switch(day) {
            case 1 :
                System.out.println("Monday");
                break; // USE to move out from block
            case 2 :
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wed - Sun");
        }
    }
}
