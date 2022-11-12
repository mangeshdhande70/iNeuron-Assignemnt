// WAP to find the maximum occurring character in a String

package Assignment_4;

import java.util.Scanner;

public class Q8__MaximumOccuringChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String :- ");
        String string = scanner.nextLine();

        string = string.toLowerCase();
        string = string.replace(" ","");

        int max = maxOccuringChar(string);
        System.out.println(max);
    }


    static int maxOccuringChar(String str)
    {
        char[] ch = str.toCharArray();
        int count;
        int max = 0 ;
        for (int i = 0; i < ch.length; i++) {
            count=1;
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (max < count)
                max=count;
        }
//        System.out.println(max);
        return max;
    }

}
