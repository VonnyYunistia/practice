package Class11;

import java.util.Scanner;

public class task {

    public static void main(String[] args) {

       String[][] members={

               {"Ciwit", "001","8","2nd","12lbs"},
               {"Wawa", "002","7","1st","16lbs"},
               {"Django", "003","6","1st","10lbs"},
               {"nina", "004","9","3rd","14lbs"},
               {"Kimba", "005","8","1st","14lbs"}

       };

        for (String[] member : members) {
            for (String s : member) {
                System.out.print(s+" ");
                System.out.println();
            }

        }











    }
}
