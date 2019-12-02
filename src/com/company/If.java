package com.company;

import javax.swing.*;

public class If {

    public static void main() {

        {
            int five = 5;
            int random = (int) Math.ceil(Math.random() * 10);

            if (five > random) {
                System.out.println("The random number is below average");
            } else {
                System.out.println("The random number is above average");
            }
        }
    }
}
