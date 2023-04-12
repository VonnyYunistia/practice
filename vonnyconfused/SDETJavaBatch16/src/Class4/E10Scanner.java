package Class4;

import java.util.Scanner;

public class E10Scanner {

    public static void main(String[] args) {


        Scanner scan=new Scanner((System.in));
        System.out.println("Please enter your gender : ");
        char gender=scan.next().charAt(0); //only extract the first letter that input which is computer start with 0
        System.out.println("you entered  "+gender);

        // there is no direct method for the char in scanner class
        // Scanner id the class that contains all the logic to take input from the using in console and keyboard
        //it can be used to write interactive program which can take input from users

        /* what is the syntax of scanner class;
        1. create the object of the scanner using :
        Scanner scan= new sacnner(System.in);

        2. then we take input using :
        next() for exampel String variable name = scan.next()
         */
    }
}
