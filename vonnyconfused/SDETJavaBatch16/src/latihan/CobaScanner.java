package latihan;

import java.util.Scanner;

public class CobaScanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name : ");
        String  name= scan.next();

        System.out.println("Please enter the grade : ");
        int grade = scan.nextInt();

        if (grade > 95) {
            System.out.println("Your grade is : A");
        } else if(grade>80){
            System.out.println("your grade is : B");
        } else if(grade > 70){
            System.out.println("your grade is : C");
        } else {
            System.out.println("you need to take retest");
        }


    }
}