package HW4;

import java.util.Scanner;

public class smallMedium {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter your number");
        int num= input.nextInt();

        if(1>num && num<10) {
            System.out.println("Small number");
        }else if(11>num && num<100){
            System.out.println("Medium Number");
        }else if(101>num && num<1000){
            System.out.println("Large number");
        }























    }
}
