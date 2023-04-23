package Review5;

public class Task4 {

    public static void main(String[] args) {

     int[][] num={
             {12,-12,67,56},
             {45,2,4},
             {56,2},
             {67,43,11,13}
     } ;

     int sumOdd=0;
     int sumEven=0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                if(num[i][j]%2 ==0){

                    sumEven+=num[i][j];
                }

            }

        }
        System.out.println(sumEven);

        System.out.println();


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                if(num[i][j]%2 !=0){

                    sumOdd+=num[i][j];
                }

            }

        }
        System.out.println(sumOdd);



    }
}

