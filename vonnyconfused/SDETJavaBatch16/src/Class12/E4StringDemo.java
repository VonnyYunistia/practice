package Class12;

public class E4StringDemo {

    public static void main(String[] args) {

        String firstName="Ana";
        String lastName="More";

        System.out.println(firstName.concat(lastName));
        // this method will error if one of the variable is null(nothing)

        String fullName=firstName+lastName;// this the most widely approach
        System.out.println(fullName);






    }
}
