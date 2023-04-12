package HW3;

import java.util.Scanner;

public class loan {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter amount you need to loan? ");
        int loan= scan.nextInt();

        if(loan<=200000){
            System.out.println("We can lend you money");
        } else  {
            System.out.println("We're sorry not to proceed your application");
        }
















    }
}
