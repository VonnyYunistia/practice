package Class7;

import java.util.Scanner;

public class E13WhileLoop {

    public static void main(String[] args) {
        // ask the user for number than print all the number 1 to that number

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the number :");

        int number=input.nextInt();
        int counter=1;

        while(counter<=number) {

            System.out.print(counter+" ");

            counter++;
        }
    }
}
