package latihan;

import java.util.Scanner;

public class PhoneFormat {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name");

        String name= scanner.next();

        System.out.println("Enter your mobile numer(xxx-xx-xxxxx)");

        String input= scanner.next();

String mobile=input.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "$1-$2-$3");

        System.out.println("Enter your age");

        int age=scanner.nextInt();

        System.out.println("your name is "+name+" , your age is "+age+" and your mobile number is "+mobile);



















    }
}
