import java.util.*;

public class replace
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		String st="";
		System.out.print("Enter the index: ");
		int a=sc.nextInt();
		for(int i=0;i<s.length();i++)
		{
			 if(a==i)
			  continue;
			 else
			 {
				st += s.charAt(i);
			 }

		}
		System.out.println(st);
	}



}
