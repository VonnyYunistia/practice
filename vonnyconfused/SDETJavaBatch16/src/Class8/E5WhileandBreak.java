package Class8;

public class E5WhileandBreak {

    public static void main(String[] args) {

     //create a boolean variable summer store true in it then write a loop
     //that runs as long as it is summer create temp store 85 and
     //inside the loop check the temp
        //less than 100 print it's good to enjoy summer
        //exceeds 100 print it's very hot break the loop


       boolean summer =true;
       int temp=85;
       while(summer) {
           if (temp < 100) {
               System.out.println("it's good to enjoy summer");
           } else{
               System.out.println("it's very hot");
               break;
           }
           temp=temp+2;

       }








    }
}
