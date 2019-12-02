package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte age = 30;
        long viewsCount = 51_234_567_890L; //long numbers need "L" at end
        float price = 10.99F;              // similar for floats
        char letter = 'A';
        boolean isEligible = false;


        //=========================================================================//
                           // Reference vs primitive
        //=========================================================================//

        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;

        point1.x++;

        byte x = 1;
        byte y = x;
        x++;

        System.out.println(y);                      //doesn't update, as primitive types used
        System.out.println(point2);                 //changes and updates x value - reference type

        //=========================================================================//
                            // Arrays - 1, 2 and 3 dimensional
        //=========================================================================//

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 5;

        // numbers[20] = 9;                         //exception as cannot have an index of 20 in array with length 5

        System.out.println(Arrays.toString(numbers));

        int[] numbers1 = {1,65,7,25,0,345,2,7};     //can initialise an array with this notation
        Arrays.sort(numbers1);                      //orders array

        int [][] twoDArray = {{1,4}, {74, 33, 2}};

        System.out.println(Arrays.deepToString(twoDArray));

        int [][][] threeDArray = new int [2] [5] [3];

        threeDArray[0][0][0] = 1;
        System.out.println(Arrays.deepToString(threeDArray));

        //=========================================================================//
                         // Finals (constants)
        //=========================================================================//

            final float Pi = 3.14F;             //'final' keyword sets a constance variable

        //=========================================================================//
                        // Mathematical functions
        //=========================================================================//

            int result = 10 + 3;
            int res2 = 10 - 3;
            int res3 = 10 * 3;
            double res4 = (double)10 / (double)3;       //need a floating point number to deal with decimals
            int res5 = res2++;
            System.out.println(res2);       // 7, as ++ is after x assignment
            System.out.println(res5);       // 8 as ln 78 adds one to value

            int res6 = ++result;
            System.out.println(res6);       // 14, as ++ is before x assignment
            System.out.println(result);       // result and res6 are equal

        //=========================================================================//
                        // Casting
        //=========================================================================//

            short m = 1;
            int n = m + 2;
            System.out.println(n); // 3, as any values that can be stored in a short (max 2 bytes) can be stored into an int (max 4 bytes)
                                   // Implicit casting => byte > short > int > long > float > double

            double r = 1.1;
            double t = r + 2;      // Implicit casting again (2 is short)

            double e = (int)r + 2;  // Explicit casting - converts r (double) to int (1.1 => 1) and adds the 2 === 3

            // can only cast compatible types - strings would have to be parsed before using

            String w = "1";
            int q = Integer.parseInt(w) + 2;        // 3
            System.out.println("q is: " + q);

        //=========================================================================//
                // Math. functions
        //=========================================================================//

        int num = (int)Math.ceil(1.1);      //have to explicitly call int, as passing in a floating point
                                            // Math .max .min .floor .round .random etc. are all usable functions
                                            // must be careful about casting - explicit has to be used quite a lot

        //int num1 = (int) Math.random() * 100;     // will always give 0 - int of 0.82740237 will always be 0 - it takes away any numbers after the decimal
        int num1 = (int) (Math.random() * 100);     // parentheses will correct this

        //=========================================================================//
                        // Number Formats
        //=========================================================================//

        NumberFormat currency = NumberFormat.getCurrencyInstance(); //factory method - creates an instance of the NumberFormat class
        String amount = currency.format(12345.6543);

        System.out.println(amount);             // returns a string representation of the number passed in, formatted as currency

        String per = NumberFormat.getPercentInstance().format(0.37);

        System.out.println(per);             // returns a string representation of the number passed in, formatted as %

        //=========================================================================//
                        // Playing around with scanners
        //=========================================================================//

        System.out.println(Arrays.toString(numbers1));

        Scanner Scanner = new Scanner(System.in);

        System.out.print("What's your name?");

        String name1 = Scanner.nextLine();      //nextLine captures all tokens entered in the line - can take multiple words

        System.out.print("What's his name?");

        String name2 = Scanner.nextLine();

        String[] nameList = {name1.trim(), name2.trim()};

        System.out.println("Hello " + nameList[0] + " who is " + nameList[1] + "?? It is " + now + " today.");  //implicit casing converts the ints to parts of string

        int five = 5;
        int random = (int) Math.ceil(Math.random() * 10);

        if (five > random) {
            System.out.println("The random number is below average");
        } else {
            System.out.println("The random number is above average");
        }

    }
}


