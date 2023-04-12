package HW6;

public class Array5 {
    public static void main(String[] args) {

        /*Create an array of animals and store 5 elements into it.
        Using 2 different loops print all elements from the array.
         */

         String[] animal={"Cats","Dogs","Dolphin","Birds","Racoon"};

        for (int i = 0; i < animal.length ; i++) {

            System.out.print(animal[i]+" ");

        }
        System.out.println();

        for (String s : animal) {

            System.out.print(s+" ");

        }













    }
}
