package Class12;

public class E12StringDemo {
    public static void main(String[] args) {

        String name = "Today is Saturday";

        System.out.println(name.indexOf('i'));

        System.out.println(name.indexOf('a'));
//start searching from index 4
        // System.out.println(name.indexOf(ch:'a',fromIndex:4));

// print all the indexes whereever letter a appear

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == 'a') {

                System.out.println(i);
            }
            }
    }}
