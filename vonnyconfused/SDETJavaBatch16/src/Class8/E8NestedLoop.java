package Class8;

public class E8NestedLoop {
    public static void main(String[] args) {

       /* for (int i = 0; i < 5; i++) {
            System.out.print("*");

        }
 let's say we wanna print it out 10 times , we doing nested loop
*/

        for (int i = 0; i <10 ; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }

            System.out.println();
        }




    }
}
