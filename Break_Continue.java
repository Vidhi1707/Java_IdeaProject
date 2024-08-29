package com.javaactivity;

public class Break_Continue {

    public static void main (String [ ] args) {

        //Break & Continue

        int i = 0;
        while(true) {
            //continue i 3 ke = hoga toh 3+1 ho jayega
            if(i == 3){
                i = i + 1;
                continue;
            }
            //break 5 ke upaar jayega toh break hokr bhr nikl jayega
            System.out.println(i);
            i = i + 1;
            if(i > 5) {
                break;
            }
        }
    }
}
