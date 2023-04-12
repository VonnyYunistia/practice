package HW5;

public class odd {
    public static void main(String[] args) {

        for (int i = 20; i <= 50; i++) {
            if(i%2==1){
                System.out.print(" "+i);
            }

        }

        System.out.println();

        int counter=20;
        while(counter<=50){
            if(counter%2 !=0){
                System.out.print(" "+counter);
                counter++;
            }
        }




    }
}
