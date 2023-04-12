package Class6;

public class E1LogicalOperators {

    public static void main(String[] args) {

        //all  data types must use relational operator (== != > < >= <=) except boolean

        // sout !true => false

        //logical operator : and && or || and not ! only work with boolean value

        int age=17;

        if(age<18 || age>60){
            System.out.println("you will get a discount");
        } else {
            System.out.println("you pay a full price");
        }

    }
}
