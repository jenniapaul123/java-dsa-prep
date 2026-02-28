package Strings;

public class PassingstringToMethod {
    
    public static void Change(String x ){
        x = "Satyarth Kumar";  //immutable string, so it will not change the original string, it will create a new string and assign it to x, but the original string name will remain unchanged

    }

    public static void main(String[] args) {
        String name = "Satyarth";
        System.out.println(name);
        Change(name);
        System.out.println(name);
    }
}
