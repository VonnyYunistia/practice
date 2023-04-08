package Class9;

public class E7Arrays {
    public static void main(String[] args) {

        int[] num={10,50,60,45,100};

        for (int i = 0; i < num.length; i+=2) {

            System.out.print(num[i]+" ");
        }

        System.out.println();

        for (int i = 0; i < num.length; i++) {

            if (i / 2 != 0) {

                System.out.print(num[i] + " ");
            }

        }
    }
}
