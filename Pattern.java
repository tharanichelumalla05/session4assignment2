/*program for printing pattern abc*/

package session4;
//Package is a grouping of related types providing access protection and name 
//created package as session4
import java.util.Scanner;
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions
public class Pattern {//created class as pattern
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//classes are the basics of opps
			
	public static void main(String[] args) {
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter

		
		int j;//initializing j
		 Scanner sc=new Scanner(System.in);
		//to scan values which we initialize
		 System.out.print("Enter N:\n");
		//System is a final class in java.lang package
			//out is a static member field of system class and it's type PrintStream
			//println is a method of PrintStream class and it means print in next line
			//Inside the brackets is value which to be printed		
			
		 int n=sc.nextInt();
		//scans next token of the input as int
		 for(int i=1;i<=n;i++)
		{
			for (j=1;j<=(n+1)-i;j++)
				System.out.print(" ");//system is used to return cod
            //out is a static member
            //println is used to print text and gives output
			for(j=1;j<=2*i-1;j++)
				if(j<=i)
					System.out.print((char)(char)(j+64)+" ");//for printing values and parallely
			//looking into ASCII code and convert them into given alphabets
								else
									System.out.print((char)(char)(2*i-j+64)+" ");//
									System.out.println();//system is used to return code
					                        //out is a static member
					                        //println is used to print text and gives output
						}
		
		 for(int i=n-1;i>=1;i--)//initializing values in for loop
			{
				for (j=1;j<=(n+1)-i;j++)//intializing
					System.out.print(" ");//system is used to return code
	                        //out is a static member
	                        //println is used to print text and gives output
					for(j=1;j<=2*i-1;j++)
				//here it will take the value and jumps into the next line		
					if(j<=i)//jless than or equal to i
						System.out.print((char)(char)(j+64)+" ");
					else
				
						System.out.print((char)(char)(2*i-j+64)+" ");
						System.out.println();//system is used to return code
                        //out is a static member
                        //println is used to print text and gives output

			}	
	}	 
}