package Class8;

public class E3forLoop {

    public static void main(String[] args) {

        //write a loop to go from 1 till 30, you have to add even number
        /*
         int num=1;
        int sum=0;
         while(num<=10){
             sum+=num;
                     num++;

         }

        System.out.println(sum);

         */

        int sum=0;
        for (int i = 1; i <=30 ; i++) {
            if(i%2==0){
                sum=sum+i;}
        }

        System.out.print(sum);

            }

        }








