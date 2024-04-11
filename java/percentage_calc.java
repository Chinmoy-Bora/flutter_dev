import java.io.*;
import java.util.*;



public class percentage_calc 
{
    
    static class input
    {   
        Scanner sc=new Scanner(System.in);
        void Input()
        {

            System.out.println("Enter the marks obtained in subject 1 :");
            int num_1=sc.nextInt();

            System.out.println("Enter the marks obtained in subject 2 :");
            int num_2=sc.nextInt();

            System.out.println("Enter the marks obtained in subject 3 :");
            int num_3=sc.nextInt();

            System.out.println("Enter the marks obtained in subject 4 :");
            int num_4=sc.nextInt();

            System.out.println("Enter the marks obtained in subject 5 :");
            int num_5=sc.nextInt();

            System.out.println("Enter the marks obtained in subject 6 :");
            int num_6=sc.nextInt();


            double perct=((num_1 + num_2 + num_3 + num_4 + num_5 + num_6)/600.0)*100 ;
            System.out.print("The percentage is : ");
            System.out.print(perct);


        }
    }

        public static void main(String[] args)
        {
            input ob= new input();
            
            ob.Input();
           
        
            
        }
    }
    
