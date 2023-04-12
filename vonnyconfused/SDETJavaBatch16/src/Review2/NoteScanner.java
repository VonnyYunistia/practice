package Review2;

import java.util.Scanner;

public class NoteScanner {

    public static void main(String[] args) {

        int i=10;

        /* 1. we need to create Scanner

         */

      Scanner input  =new Scanner(System.in);

        System.out.println("please enter full sentence");
        String sentence=input.nextLine();

        System.out.println("Please enter 1 word");

        String word = input.next();
        System.out.println("Word that was captured = "+word);

        System.out.println("please enter integer number");

        int inp=input.nextInt();
        System.out.println("Entered number is "+inp);

        System.out.println("please enter decimal value");
        double decimal= input.nextDouble();
        System.out.println("Decimal value is "+decimal);














    }
}
