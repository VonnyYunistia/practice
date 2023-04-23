package Class12;

public class E2StringDemo {

    public static void main(String[] args) {

        String userName="admin";
        String password="pass123";

        //write the code the check username and password are less than 8 characters
        // print sign up successfully
        //otherwise print username and password can't be more than 8 characters

        if(userName.length()<8 || password.length()<8){
            System.out.println("sign Up Successfully");
        }
        else {
            System.out.println("username and password can't be more than 8 characters");
        }








    }









}
