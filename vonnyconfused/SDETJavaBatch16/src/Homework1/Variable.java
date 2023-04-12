package Homework1;

public class Variable {

    public static void main(String[] args) {

       String firstName = "Vonny" ;
       String lastName = "Yunistia";
       char grade = 'b';
       String city = "Alpharetta,";
       String state = "GA";
       String cell  = "+1469-000-000";
       String intro = "my name is";
       String intro2 = "my phone number is";

        System.out.println(intro +"  " + firstName +" " + lastName);
        System.out.println("I am " + grade + " " + "student");
        System.out.println("I live in"+" "+city +" " + state);
        System.out.println("and" +" "+ intro2 + " " + cell);


        grade = 'a';
        city = "and I moved to Cumming";
        cell = "+1469-000-001";
        intro2 = " and my new phone number is";

        System.out.println(intro +"  " + firstName +" "+ city + intro2 +" "+ cell );
        System.out.println("I am " + grade + " " + "student");

















    }
}
