package Class7;

public class E11Whileloop {

    public static void main(String[] args) {

        /* print number 100-1
        print even number 100-1
        print odd number 100-1
         */
        int num=100;
        while(num>=1){

                System.out.print(" " +num);

            num--;
        }
 // assigning a new value to counter

        num=20;
        while(num<=100){

            System.out.println(" "+num);
            num+=2;
        }

        num =100;
        while(num>=1){
            if(num%2 !=0) {
                System.out.print(" " + num);
            }

            num--;

        }




    }
}
