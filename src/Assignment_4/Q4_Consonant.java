package Assignment_4;

import java.util.Scanner;

public class Q4_Consonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String :- ");
        String string = scanner.nextLine();
        string = string.toLowerCase();
        System.out.println("String length :- "+string.length());
        int vowels = 0, consonant = 0, specialChar = 0,numerics = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) >= 33 && string.charAt(i) <= 47 || string.charAt(i) >= 58 && string.charAt(i) <= 64
                    || string.charAt(i) >= 91 && string.charAt(i) <= 96 ||
                    string.charAt(i) >= 123 && string.charAt(i) <= 126) {
                specialChar++;
            } else if (string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u'
                    || string.charAt(i) == 'a' || string.charAt(i) == 'e') {
                vowels++;

            } else if (string.charAt(i) >= 48 && string.charAt(i)<=57) {
                numerics++;
                
            } else {
                consonant++;
            }

        }

        System.out.println("Consonant = "+consonant+"\nVowels = "+vowels+
                "\nSpecial Character = "+specialChar+"\nNumerics = "+numerics);

    }


}
