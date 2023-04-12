package latihan;

import java.util.Scanner;

public class NumberLarge {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Please enter two words ");

        String word1=input.next();
        String word2=input.next();

        System.out.println("Please enter two numbers");
        int n1=input.nextInt();
        int n2=input.nextInt();


        if(n1==n2 && word1==word2){
            System.out.println("AND");
        }

        else if(n1!=n2 || word1==word2){
            System.out.println("OR");
        }


        else if (n1!=n2 && word1!=word2){
            System.out.println("NONE");
        }


    }










    }


