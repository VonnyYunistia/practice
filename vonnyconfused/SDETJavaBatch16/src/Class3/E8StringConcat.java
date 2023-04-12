package Class3;

public class E8StringConcat {

    public static void main(String[] args) {


        System.out.println("Leo"+10+10);

        // java will execute from left to right, result will be string
        // the result will be Leo1010

        System.out.println(10+10+"Leo");
        // the result will be 20Leo
        //addition process first

        System.out.println(2+2*2);
        //priority operation multiplication
        //that's why left to right rule doesn't apply to math operation
        //the result will be 6

    }
}
