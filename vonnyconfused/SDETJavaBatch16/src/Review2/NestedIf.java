package Review2;

import javax.sound.midi.Soundbank;
import java.util.SortedMap;

public class NestedIf {

    public static void main(String[] args) {



    //declare 2 variable for DL and car
     // if you have a car then i will check if you have a car

      boolean driverLisence=true;
      boolean car=true;

      if(driverLisence){
          System.out.println("let's check if you have a car");

      if(car){
          System.out.println("You can drive");
      }else {
          System.out.println("You will use uber");
      }

      }else {
          System.out.println("you should get DL");
      }





    }
}
