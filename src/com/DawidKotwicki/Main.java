package com.DawidKotwicki;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("Result = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println(previousResult + " + 1  = " + result);

        result++;
        System.out.println("Result is now: " + result);
        result--;
        System.out.println("Result is now: " + result);
        result+=2;
        System.out.println("Result is now: " + result);
        result*=10;
        System.out.println("Result is now: " + result);
        result-=10;
        System.out.println("Result is now: " + result);
        result/=10;
        System.out.println("Result is now: " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!!");

        int topScore = 100;
        if(topScore >= 100)
            System.out.println("You got the high score!!");

        //Ternary operator
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if(isCar)
            System.out.println("wasCar is true");

        //Challenge
        double val1 = 20d, val2 = 80d;
        double sumVal1Val2 = (val1 + val2) * 25d;
        System.out.println("Total = " + sumVal1Val2);
        double rem = sumVal1Val2 % 40d;
        System.out.println("Remeinder is " + rem);
        if(rem <= 20)
            System.out.println("Total was over the limit");

    }
}
