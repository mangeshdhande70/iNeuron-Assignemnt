
// WAP to implement Pangram Checking with least inbuilt methods being used

package Assignment_4;

public class Q6__Pangram {

    public static void main(String[] args) {

        String s = "ThE qUiCk bRoWn fOx JuMpS OvEr THe lAzY dOg";

        boolean result = isPangram(s);
        System.out.println(result);


    }

    static boolean isPangram(String str)
    {
        boolean flag = true;

        str = str.replace(" ","");


        if (str.length() < 26)
            return false;

        str = toUpperCaseInClass(str);

        char [] ch = str.toCharArray();
        int [] array = new int[26];

        for (int i = 0; i < ch.length; i++)
            array[ch[i] - 65]++;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                 flag = false;
            }
        }
        return flag;
    }

    static String toUpperCaseInClass(String str)
    {

        String newString = "";
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) >= 65 && str.charAt(i)<=90)
                newString+=str.charAt(i);
            else
            {
                newString+=(char)(str.charAt(i)-32);
            }
        }
        return newString;

    }

}
