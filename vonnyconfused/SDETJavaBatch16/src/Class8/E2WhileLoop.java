package Class8;

import java.util.Scanner;

public class E2WhileLoop {

    public static void main(String[] args) {
        //in a while loop ask the user to enter numbers



        Scanner input=new Scanner(System.in);
        System.out.println("please enter number");
        int num = input.nextInt();

        while(num!=-1){
            System.out.println("try again");
            num=input.nextInt();
        }
        System.out.println("Hello world");







    }
}
