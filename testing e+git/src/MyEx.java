
public class MyEx 
{
	public static void main(String[] args) 
	{
		GetSum(2,3);
	}
	
	
	//only adds together. 
	//------another step could be check and make sure are numbers
	//------make another one that finds the square root, but only if the answer is an int?
	static int GetSum(int x, int y)
	{
		int sum = x + y;
		return sum;
	}
	
	static int GetDifference(int x, int y)
	{
		int dif = x - y;
		return dif;
	}
	
	static int GetProduct(int x, int y)
	{
		int prod = x * y;
		return prod;
	}
	
	static int GetQuotient(int x, int y)
	{
		//assumed dividend = x, divisor = y
		//-----------------maybe add some kind of checker to see if result is float
		int quot = x / y;
		return quot;
	}
	
	
	
	
	
	
	
	
	
	//---------make a method that checks all the numbers in an array?
	//---------reads in all the numbers in an external file
	
}
