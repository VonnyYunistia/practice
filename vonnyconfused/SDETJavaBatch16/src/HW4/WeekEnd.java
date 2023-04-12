package HW4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WeekEnd {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int day = input.nextInt();

        if(day>=1 && day<=5){
            System.out.println("it's a weekend");

        } else if(day>=6 && day<=7){
            System.out.println("It's week end");
        }else {
            System.out.println("invalid day");
        }








    }
}
