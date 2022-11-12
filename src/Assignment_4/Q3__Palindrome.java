package Assignment_4;

public class Q3__Palindrome {

    public static void main(String[] args) {

        String string = "2552";
        boolean result = isPalindrome(string);
        System.out.println(result);

    }

    static boolean isPalindrome(String string)
    {
        String str = "";
        for (int i = string.length()-1; i >= 0; i--) {
            str+=string.charAt(i);
        }
        if (str.equals(string))
            return true;

        return false;
    }


}
