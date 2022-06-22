package com.loop;

public class loopTest {
    public static void main(String[] args) {
        int someValue = 4;
        int factorial=1;
        while (someValue >1){
            factorial *=someValue;
            --someValue;
        }
        System.out.println(factorial);
        int increment=1;
        while(increment < 30 ){
            increment++;
            if (increment== 19 )
                System.out.println("hey mon ami tu aimes les patates ?");
            else
            System.out.println(increment);
        }
    }
}
