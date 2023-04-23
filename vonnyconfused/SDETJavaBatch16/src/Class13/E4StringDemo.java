package Class13;

public class E4StringDemo {

    public static void main(String[] args) {

        String str="Today is sunday. We have Java class. We like Java";

        String[] strArr=str.split("[.]");
        //String[] strArr=str.split("[.!?]");

        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[2].trim());





    }
}
