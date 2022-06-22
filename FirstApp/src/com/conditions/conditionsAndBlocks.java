package com.conditions;

public class conditionsAndBlocks {
    public static void main(String[] args) {
        System.out.println("is it working !");

        //conditional assignement
        int value1 = 5;
        int value2 = 3;
       // int totalValue = value1 > value2 ? value1: value2;
        int totalValue = value1 > value2 ? value1: value2;
        System.out.println(totalValue);//display 5

        //if - else statement
        int value11 =91;
        int value22 =22;
        if (value11 < value22)
        System.out.println("return true !");
        //si l'on souhaite pas executer une instruction si c faux pas besoin de mettre un else
        else
        System.out.println("return false !");
        // chaining if else
        if (value11 > value22)
            System.out.println("value11 is biger than Value22");
        else if (value11 > value22 )
            System.out.println("value11 is smaller than Value22");
        else
            System.out.println("it can be also equals");

    }
}
