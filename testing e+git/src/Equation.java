//----added in equation class that contains all 3 parts of an equation
public class Equation
{
	private String FirstDigit;
	private String SecondDigit;
	private String Symbol;
	
	//"eq" must be an equation following format "IntSymbolInt" where symbol is one of "+,-,*,/"
	public Equation(String eq)
	{
		//these are the private methods that can find the values from the provided equation string
		FirstDigit = GetFnum(eq);
		SecondDigit = GetLnum(eq);
		Symbol = GetSymbol(eq);
	}
	
	//these are the getter functions that allow outside viewing of the equation object pieces
	public String getFirst()
	{
		return FirstDigit;
	}
	
	public String getSecond()
	{
		return SecondDigit;
	}
	
	public String getSym()
	{
		return Symbol;
	}
	
	
	//----originally taken from file reader
	
	private static String GetFnum(String eq)
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
	private static String GetSymbol(String eq)
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
	
	
	private static String GetLnum(String eq)
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


