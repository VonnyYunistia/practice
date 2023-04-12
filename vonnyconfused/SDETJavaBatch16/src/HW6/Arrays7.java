package HW6;

public class Arrays7 {

    public static void main(String[] args) {

   //  From an array of integer elements find the largest number.

int[] num={8,10,-4,7,2};

int max= num[0];

        for (int i = 0; i < num.length; i++) {
            if(num[i] > max)
                max= num[i];
        }
        System.out.println(max);
















    }
}
