package Class10;

public class E5D2Arrays {

    public static void main(String[] args) {

        int [][]  matrix={
                {10,20,30,40,50},//5 elements,4 index
                {20,50,65,20},//4 elements,3 index
                {102,54,60},// 3 elements, 2 index
                {20,55}
        };

        for (int row= 0; row < matrix.length; row++) {
            // int[] arr=matrix[row];
            for (int column= 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }

// index always size(elements)-1
        
        








    }
}
