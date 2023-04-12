package Review2;

public class AnotherNestedIf {

    public static void main(String[] args) {


        // if you have a covid vaccine or not

        /* if dose=1 -> you need 2 to be fully vaccinated
        if dose=2 >> you fully vaccinated
        if dose=3 >> you fully and booster

         */

        boolean vaccine=false;
        int dose=1;

        if(dose==1){
            System.out.println("You need second dose");

            if(dose==2) {
                System.out.println("you fully vaccinated");
            } else if(dose==3){
                System.out.println("you fully and booster");
            }

        } else {
            System.out.println("you not vaccinated");
        }

















    }
}
