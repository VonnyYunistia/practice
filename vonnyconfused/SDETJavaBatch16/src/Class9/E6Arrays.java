package Class9;

public class E6Arrays {
    public static void main(String[] args) {

        char[] c={'A','B','C','D','E'};

        for (int i = 0; i < 5; i++) {
            if(i%2==0) {

                System.out.print(c[i]+" ");
            }
        }

        System.out.println();

        for (int i = 0; i < 5; i+=2){
            System.out.print(c[i]+" ");
        }
    }
}
