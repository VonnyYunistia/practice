package HW5;

public class print2 {
    public static void main(String[] args) {

         int counter=20;
        while(counter>=1){
            System.out.print(" "+counter);

            counter-=2;
        }

        System.out.println();

        for(int i= 20; i>=1 ; i--) {

            if(i%2==0) {
                System.out.print(" " + i);
            }
        }
    }
}
