package HW4;

import java.util.Scanner;

public class Season {

    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);

        System.out.println("Please enter your birth month(First letter upper case)");

        String month=input.next();

        if(month.equals("December") || month.equals("January") || month.equals("February")){
            System.out.println("You were born in Winter season");
        } else if(month.equals("March") || month.equals("April") || month.equals("May")){
            System.out.println("You were born in Spring season");
        } else if (month.equals("June") || month.equals("July") || month.equals("August")){
            System.out.println("You were born in Summer season");
        } else {
            System.out.println("you were born in fall season");}
















    }
}
