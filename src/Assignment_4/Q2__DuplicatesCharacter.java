package Assignment_4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Q2__DuplicatesCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String string = scanner.nextLine();
        string = string.replace(" ","");
        string = string.toLowerCase();
        toPrintDuplicateCharInString(string);

    }

    static void toPrintDuplicateCharInString(String str) {
        char[] ch = str.toCharArray();

        int count=0;
        for (int i = 0; i < ch.length; i++) {
            count=1;
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0';
                }
            }
            if (count>1 && ch[i] != '0')
                System.out.println(ch[i]);
        }

    }
}


