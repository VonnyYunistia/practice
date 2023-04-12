package Review2;

public class IfElse {

    public static void main(String[] args) {

        int age=18;

        if(age>=18){
            System.out.println("You can get a DL");
        }else{
            System.out.println("you ate too young to drive");
        }

String expected="best seller";

        if(expected.equals("Best sellers")){
            System.out.println("Test passed");
        }else {
            System.out.println("test failed");
        }
    }
}
