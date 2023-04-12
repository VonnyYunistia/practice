package Class4;

import java.util.Scanner;

public class E9Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("are you hungry, please enter true/false");
        Boolean hungry= scan.nextBoolean() ;

        if(hungry){
            System.out.println("let's order pizza");
        } else {
            System.out.println("Let's practice Java");
        }





    }
}
