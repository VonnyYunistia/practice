package Class11;

public class E3D2Array {

    public static void main(String[] args) {


        String[][]  names={
                { "Sarah","Ciwit","Wawa","Django"},
                {"Farwa","Ali","Halima","Samir"}
        };

        for(String[] nameArr : names){

            for (String s : nameArr) {
                System.out.println(s);

            }
        }





    }
}
