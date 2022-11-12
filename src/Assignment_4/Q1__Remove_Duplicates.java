
// WAP to remove Duplicates from a String.(Take any String ex with duplicates character)

package Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q1__Remove_Duplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String string = scanner.nextLine();

        String newString = removeDuplicates(string);
        System.out.println(newString);


        System.out.println("Enter a String : ");
        String str = scanner.nextLine();

        String newStr = removeDuplicatesUsingInbuildMethod(str);
        System.out.println(newStr);

    }

    static String removeDuplicates(String string)
    {
        String str = "";
        char [] ch = string.toCharArray();
        sort(ch);

        for (int i = 0; i < ch.length-1; i++) {
            if (ch[i] != ch[i+1])
                str+=ch[i];
        }
        str+=ch[ch.length-1];
//        System.out.println("\n"+str);

        return str;
    }
    static void sort(char [] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index])
                {
                    min_index = j;
                }
            }
            char temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }

    }

   static String removeDuplicatesUsingInbuildMethod(String str)
    {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        String string = "";

        for (int i = 0; i < ch.length-1; i++) {
            if (ch[i] != ch[i+1])
                string+=ch[i];
        }
        string+=ch[ch.length-1];

        return string;

    }


}
