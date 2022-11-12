
// WAP to find if String contains all unique characters.

package Assignment_4;

import java.util.Scanner;

public class Q7__UniqueChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String :- ");
        String s = scanner.nextLine();
        s = s.replace(" ","");
        char[] ch = s.toCharArray();
        boolean flag = true;

        for (int i = 0; i < ch.length ; i++) {
            for (int j = i+1; j < ch.length ; j++) {
                  if (ch[i] == ch[j])
                      flag = false;
            }
        }

        if(flag) System.out.println("String contain unique Character");
        else System.out.println("String contains duplicates character");



    }


}
