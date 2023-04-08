package Class9;

public class E5Arrays {
    public static void main(String[] args) {

        String[] names={"Jacob","Lean","Vonny", "ashgar", "wawa"};

        for (int i = 2; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }

        System.out.println();

        for (int i = 2; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }

        System.out.println();

int counter=0;
        while(counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }




    }
}
