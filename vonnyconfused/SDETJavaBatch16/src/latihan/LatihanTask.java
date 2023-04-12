package latihan;

import java.util.Scanner;

public class LatihanTask {

    public static void main(String[] args) {

       /* prompt the user to enter person height in inches
       short (under  60 inch
       medium between 60-72
       tall over 72
        */
        Scanner input= new Scanner(System.in);

        int widht = input.nextInt();
        System.out.println("Please enter the widht ");

        int lenght = input.nextInt();
        System.out.println("Please enter the length ");


        if(widht != lenght){
            System.out.println("The shape of your object is rectangle");
        } else {
            System.out.println("The shape of your object is square");
        }






    }
}
