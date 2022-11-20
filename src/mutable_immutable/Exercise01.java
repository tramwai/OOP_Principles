package mutable_immutable;

public class Exercise01 {

    /**
    Create a method that takes a string and returns a string.
    if the given string has even length and length is at least 2,
    then insert * in the middle of the string
    aa -> a*a
    java -> ja*va

     if the given string has odd length and length is at least 3,
     then insert * before and after the middle of the string
     aaa -> a*a*a
     olena -> ol*e*na

     if the string is empty or length of 1, return String itself
     */

    public static String insertStar(String str){
     if (str.length() <= 1) return str;
     if (str.length() % 2 == 0) {
         return new StringBuilder(str).insert(str.length() / 2, "*").toString(); // condition for even
     }
     else {
         return new StringBuilder(str).insert(str.length() / 2, "*").insert(str.length() / 2 + 2,"*").toString(); // condition for odd
     }
    }



    public static void main(String[] args) {
        System.out.println(insertStar(""));
        System.out.println(insertStar("aa"));
        System.out.println(insertStar("aaa"));
        System.out.println(insertStar("aaaaa"));
    }
}
