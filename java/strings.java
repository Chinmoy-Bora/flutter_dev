import java.io.*;
import java.util.*;

public class strings {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the string:");
        String name= sc.nextLine();

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println(name.substring(5));

        System.out.println(name.trim());

        System.out.println(name.substring(1,4));

        System.out.println(name.replace('c','b'));

        System.out.println(name.startsWith("Chi"));

        System.out.println(name.endsWith("rah"));

        System.out.println(name.charAt(0));

        System.out.println(name.indexOf('c'));

        System.out.println(name.lastIndexOf(0,3));

        System.out.println(name.equals("Borah"));

        System.out.println(name.equalsIgnoreCase("BorAh"));

        

    }
    
}
