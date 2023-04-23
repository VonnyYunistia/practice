package Review5;

public class ArrayRecap {

    public static void main(String[] args) {

        String[] languanges={"English","Russian","Turkish","French","Spanish"};


        //for(dataType variable(new one): array,existing or collection){
        //       SOPln(variable);}


        for(String variable : languanges ){
            System.out.print(variable+" ");
        }

        System.out.println("--------------REVERSE--------------");
        // I want to print elements in reverse order

        for (int i =languanges.length-1 ; i >=0 ; i--) {

            System.out.println(languanges[i]);
        }




    }
}
