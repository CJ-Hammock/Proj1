import java.io.*;
import java.util.Scanner;

public class FileReader
{
	
		public static void main(String[] args) 
		{
			//-----file location 
			//String f = "/Users/C.J. Hammock/git/Project1/testing e+git/src/Equations.dat";//file location
			//System.out.println(GetFile(f));
		}
		
		static String GetFile( String inputFile)
		{
			String s = "";//initialize empty string
			try 
			{
				Scanner Scnr = new Scanner(new File(inputFile));
				//read.useDelimeter(";"); //uses a semicolon delemeter for Scnr.next();
				while(Scnr.hasNext())
				{
					s = Scnr.next();//will be able to get the next string before delimeter
				}
				Scnr.close();
			}
			catch (IOException e)
			{
				System.out.println(e.getMessage());
			}
			return s;
			
		}

		static String GetFnum(String eq)
		{
			String fnumber = String.valueOf(eq.charAt(0));//this ensures that if the first number has a -ve sign it is included and not tricking the symbol checker
			
			for(int i=1; i < eq.length()-1; i++ )
			{
				if(eq.charAt(i)==('+')||eq.charAt(i)==('-')||eq.charAt(i)==('*')||eq.charAt(i)==('/'))//--------can shorten by making the "or"s refrence one call of "charAt"
					break;//stop looping if symbol found
				else
					fnumber += eq.charAt(i);//adds digits of first number as equation parsed through
			}
		return fnumber;
		}
		
		//assumes string given is an equation like (#symbol#) with no spaces, can include negatives
		static String GetSymbol(String eq)
		{			
			String symb = "";//initialize empty string
			
			for(int i=1; i < eq.length()-1; i++ )//start at 1 to avoid possible -ve sign of first number 
			{
				//finds the symbol of the input formula
				if(eq.charAt(i)==('+')||eq.charAt(i)==('-')||eq.charAt(i)==('*')||eq.charAt(i)==('/'))//--------can shorten by making the "or"s refrence one call of "charAt"
				{
					symb = String.valueOf(eq.charAt(i));	
					break;//once symbol is found, stop looping
				}
			}
		return symb;
		}
		
		static String GetLnum(String eq)
		{			
			String lnumber = "";//initialize empty string
			boolean start=false;
			
			for(int i=1; i < eq.length(); i++ )//start at 1 to avoid possible -ve sign of first number 
			{
				if(start)
					lnumber += String.valueOf(eq.charAt(i));
				//finds the symbol of the input formula
				if(eq.charAt(i)==('+')||eq.charAt(i)==('-')||eq.charAt(i)==('*')||eq.charAt(i)==('/'))//--------can shorten by making the "or"s refrence one call of "charAt"		
					start=true;//once symbol is found, start parsing for the last number
			}
		return lnumber;
		}
		
}
