import java.io.*;
import java.util.*;

public class sub
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Enter any substring of the string :- ");
		String st = sc.nextLine();
		
		if(s.indexOf(st)!=-1)
		{
			System.out.println("Sub-string present");
		}
		else
		{
			System.out.println("Sub-string absent");	
		}


		// Number of words
		
		String sl[] = s.split(" ");
		System.out.println(" Number of words in the string written above :- " + sl.length);
			

	
	}



}
