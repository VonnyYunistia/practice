package Class9;

public class E12Arrays {
    public static void main(String[] args) {

        int[] n = new int[5]; // the size max is 5
        n[0] = 50; // store 50 to index 0
        n[1] = 60;
        n[2] = 70;
        n[3] = 80;
        n[4] = 90;
 int num=50;
        for (int i = 10; i < n.length; i++) {
            n[i] =num;
            num=num+10;
        }

        for (int number : n) {
            System.out.println(number);

        }



}


}

