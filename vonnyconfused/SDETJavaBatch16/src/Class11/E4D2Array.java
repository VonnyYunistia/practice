package Class11;

public class E4D2Array {
    public static void main(String[] args) {

        int[][]   arr2D={ {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
        };

        // print only odd number

        for (int[] ints : arr2D) {
            for (int anInt : ints) {

                System.out.println(anInt);
            }
        }







    }
}
