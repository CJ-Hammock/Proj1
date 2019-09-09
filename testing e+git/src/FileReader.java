import java.io.*;
import java.util.Scanner;

//----added in equation class that contains all 3 parts of an equation






public class FileReader
{
	
		public static void main(String[] args) 
		{
			//-----file location 
			//String f = "/Users/C.J. Hammock/git/Project1/testing e+git/src/Equations.dat";//file location
			//System.out.println(GetEquation(f, 1));
		}
		
		//gets the equation at the file location given and what number it is in the order
		static Equation GetEquation( String inputFile, int EquNum)
		{
			String s = "";//initialize empty string
			try 
			{
				Scanner Scnr = new Scanner(new File(inputFile));
				Scnr.useDelimiter(";"); //uses a semicolon delemeter for Scnr.next();
				//-----ineffecient way to get a function at a set location
				for(int i = 0; i <= EquNum; i++)
				{
					if(Scnr.hasNext())
					{
						s = Scnr.next();//will be able to get the next string before delimeter
					}
					else
					{
						//should probably throw an error
						break;
					}
				}
				Scnr.close();
			}
			catch (IOException e)
			{
				System.out.println(e.getMessage());
			}
			//--------should have a way of checking that not an empty string
			Equation E = new Equation(s);
			return E;

		}
		
		//------------removed getFile method. getting parts of equation moved to new equation class
		
}
