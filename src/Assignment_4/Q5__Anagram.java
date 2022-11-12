
// WAP to implement Anagram Checking least inbuilt methods being used

package Assignment_4;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Q5__Anagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String 1 :- ");
        String string1 = scanner.nextLine();
        System.out.println("Enter String 2 :- ");
        String string2 = scanner.nextLine();

        boolean result = isAnagram(string1,string2);
        System.out.println(result);

    }
    static boolean isAnagram(String string1 , String string2)
    {
        string1 = toLowerCaseInClass(string1);
        string2 = toLowerCaseInClass(string2);
//        System.out.println(string1);
//        System.out.println(string2);

        string1 = sort(string1);
        string2 =sort(string2);
//        System.out.println(string1);
//        System.out.println(string2);

        if (string1.equals(string2))
            return true;

        return false;

    }
    static String toLowerCaseInClass(String str)
    {
        String newString = "";
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) >= 97 && str.charAt(i)<=122)
                newString+=str.charAt(i);
            else
            {
                newString+=(char)(str.charAt(i)+32);
            }
        }
//        System.out.println(newString);
        return newString;

    }
    static String sort(String str)
    {
        char [] ch = str.toCharArray();

        for (int i = 0; i < ch.length ; i++) {
            int min_index = i;
            for (int j = i+1; j < ch.length ; j++) {
                if (ch[min_index] > ch[j])
                    min_index=j;
            }
            char ch1 = ch[i];
            ch[i] = ch[min_index];
            ch[min_index] =ch1;
        }
        return (new String(ch));
    }

}
