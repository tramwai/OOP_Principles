package mutable_immutable;

public class ReverseString {

    /**
      Write a method that takes a string and returns it back reversed
     Hello -> olleH
     Java -> avaJ
     a -> a
     1234 -> 4321
     Good morning
     */

    public static String reverseString(String str){
        return  new StringBuilder(str).reverse().toString();
    }

    // palindrome
    public static boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);

    }




    public static void main(String[] args) {

        System.out.println(isPalindrome("civic "));
        System.out.println(reverseString("java is fun"));
    }
}
