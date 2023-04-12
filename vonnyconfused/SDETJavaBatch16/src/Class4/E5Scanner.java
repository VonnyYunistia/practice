package Class4;

import java.util.Scanner;

public class E5Scanner {

    public static void main(String[] args) {



        /*Scanner is a class  which know how to take input from the keyboard
        scan is variable of type scanner
        new is special keyword which create the object of class
        scanner(system.in) means we want to use the scanner class for taking the user input

        whenever we need to take the input from the user we need this syntax

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name=scan.next();
        System.out.println("you are amazing "+name);






    }
}
