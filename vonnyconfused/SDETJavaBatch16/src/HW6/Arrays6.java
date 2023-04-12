package HW6;

public class Arrays6 {

    public static void main(String[] args) {

        /*
        Create an array on integers and calculate the sum of all elements in an array
         */

        int[] num={2,4,6,8,10};
        
             int sum=0;


        for (int i = 0; i <= num.length-1; i++) {

            sum+=num[i];

        }
        System.out.println(sum);

    }
}
