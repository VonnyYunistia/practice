package Class6;

public class E5SwitchStatement {

    public static void main(String[] args) {

        // not all data types are spotted by switch
        //boolean and float and double don't work at switch

        char gender='F';

        switch (gender){
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Male");
        }






    }
}
