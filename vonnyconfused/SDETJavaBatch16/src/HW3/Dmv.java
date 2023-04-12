package HW3;

import java.util.Scanner;

public class Dmv {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age= scan.nextInt();

        if(age>18){
            System.out.println("We will issue your driver lisence");
        } else {
            System.out.println("We can offer you a learner permits");
        }








    }
}
