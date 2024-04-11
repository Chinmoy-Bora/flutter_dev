import java.io.*;
import java.util.*;


public class palindrome
{
  	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
	StringBuilder sb = new StringBuilder();
	sb.append(s);
	sb.reverse();
	String rev = sb.toString();
	System.out.println(rev);
	
	if(s.equals(rev))
		{
		  System.out.println("Palindrome");
		}
	else
	{	
	   System.out.println("Not palindrome");
	}

	}	


}
