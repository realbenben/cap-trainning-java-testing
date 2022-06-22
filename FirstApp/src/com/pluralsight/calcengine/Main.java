package com.pluralsight.calcengine;

public class Main {
    public static void main(String[] args) {
    double value1 = 100.00d;
    double value2 = 50.00;
    double result;
    boolean vrai =true;
    boolean faux =false;
    char opCode ='d';
    if (opCode == 'a')
        result = value1 + value2;
    else if (opCode == 's')
        result = value1 - value2;
        //System.out.println("c moin !");
    else if (opCode == 'm')
        result = value1 * value2;
    else if (opCode == 'd')
        result = value1 / value2;
    else {
        result = 0.0d;
        System.out.println(result);
    }
        // logical operator
        // ici un seul operateur cela permet de verif cond2 si cond 1 fause
        int a =20 , b=15, c=5;
        if (a>b & b>c)
            //si a>b & b>c sont vrai , alors le sys out apparait
            System.out.println("oh yeah this is fucking true ! ! !");
        if (a>b ^ b<c)
            System.out.println("one of both are true");
        else
            System.out.println("both r true or false");
        if (a != b)
        System.out.println("its different");
        else
        System.out.println("same shit !");

        // logical vs conditional
        int students = 150;
        int rooms = 0;
        if (rooms != 0  && students/rooms >30)
            //ici le prog plante car il verifie les 2 conds si mis &&
            // le prog n'execute pas l'opé /o et sa plante pas

        System.out.println("salle blindé !");
        System.out.println("end of the program");

        //block statement
        int v1=10, v2 = 4;
        final int diff;
        // si je n'initialise pas diff en dehors du bloc a cause du scope j'aurai une erreur
        // met la variable dif dans le if et sa plante !
        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger than v2 the diff is" + diff);
        }else {
            diff = v2 - v1;
            System.out.println("v2 is bigger than v1 the diff is" + diff);
        }
        System.out.println(diff);
/*
on attaque les switchs on reprend l'exo opcode
 */

        switch (opCode){
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value1 / value2;
                System.out.println(result);
                break;
            default:
                result = 0.0d;
                System.out.println(result);
        }
    }
}

