package Class10;

public class E4D2Arrays {

    public static void main(String[] args) {

        // whenever we need to repeat code we should replace it with loop

        //from E3, make it loop

        int [][]  matrix={
                {10,20,30},
                {20,50,65},
                {102,54,60}
        };




        for (int j = 0; j <matrix.length; j++)// 3 indicate the size


        {
            int[] arr1=matrix[j];

            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i]+" ");

            }

            System.out.println();
        }











    }
}
