package latihan;

import java.util.Scanner;

public class ArrayReverseOrder {
    public static void main(String[] args) {

        int[] numbers = new int[5];

       Scanner scan = new Scanner(System.in);
        for(int i =0 ;i<numbers.length;i++) {
            numbers[i] = scan.nextInt();
        }
        for(int i =numbers.length-1;i>=0;i--) {
            System.out.println(numbers[i]);
        }


















    }
}
