package Class11;

public class E6D2Array {
    public static void main(String[] args) {

        int[][]   num={ {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
        };

        // add all the elements for each row
         
        int sum=0;

        for (int[] ints : num) {
            for (int anInt : ints) {
                sum=sum+anInt;
            }
            System.out.println(sum);
            // to reset sum become =0
        }
        }
    }






