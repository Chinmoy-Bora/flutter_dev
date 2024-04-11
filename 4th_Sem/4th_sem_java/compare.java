import java.util.*;
import java.io.*;
public class compare
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1:");
		String s1=sc.nextLine();
		System.out.println("Enter the string 2:");
		String s2=sc.nextLine();
		if(!(s1==s2))
			System.out.println("Equal strings");
		else
			System.out.println("Not equal strings");
		
		s1=s1.concat(s2);
		System.out.println("The new string is: "+s1);
		
	}




}
