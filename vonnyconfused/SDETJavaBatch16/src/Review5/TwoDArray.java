package Review5;

public class TwoDArray {

    public static void main(String[] args) {


        String[][]  cars={
                {"Ford","Lincoln","Dodge"},
                {"BMW","Audi","Mercedes","VW","Fiat"},
                {"Honda","Toyota","Subaru","Nissan"}
        };

        System.out.println(cars[1][1]);

        //retrieve all elements

        for(String[] garage : cars){

            for(String car : garage){

                System.out.print(car+" ");
            }
        }














    }
}
