package Strings;

public class BuiltinMethods {

    public static void main(String[] args) {
        String name = "Jennia Paul";
        System.out.println(name.length());  //length() method returns the length of the string
        System.out.println(name.toUpperCase());  //toUpperCase() method converts the string to uppercase
        System.out.println(name.toLowerCase());  //toLowerCase() method converts the string to lowercase
        System.out.println(name.charAt(0));  //charAt() method returns the character at the specified index
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));  //lastIndexOf() method returns the last occurrence of the specified character in the string
        System.out.println(name.contains("Paul"));  //contains() method checks if the string contains the specified sequence of characters

        
    }
}
