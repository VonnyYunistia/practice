package Class8;

import java.util.Scanner;

public class latihan1 {

    public static void main(String[] args) {



        Scanner input= new Scanner(System.in);
        System.out.print("please enter first ,step and end number");
        int start= input.nextInt();

        int end=input.nextInt();

        int step=input.nextInt();

        int number=start;
        while(number<=end){
            System.out.print(number+" ");
            number++;

        }



    }
}
