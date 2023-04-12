package HW6;

public class Arrays4 {
    public static void main(String[] args) {

    /*    Create an array of cars and store 6 elements into it.
    Using 2 different loops print all values from the array.
     */

        String[] car={"Honda","Kia","Toyota","Subaru","Hyundai","Tesla"};
        for (int i = 0; i < car.length; i++) {

            System.out.print(car[i]+" ");

        }

        System.out.println();

        for (String s : car) {
            System.out.print(s+" ");

        }















    }
}
