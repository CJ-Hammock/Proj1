import static org.junit.Assert.*;
import org.junit.Test;

public class FileReaderTest {
	@Test
	public void testFileParts() //add in ability to test a text file?
	{
		//this reads the contents of a file that now has an equation
		String File = "/Users/C.J. Hammock/git/Project1/testing e+git/src/Equations.dat";
		
		//these are the equivalent elements of the file being read in that should be what the methods are able to produce. you must change the contents of the file and these variables simultaniously to accurately test.
		String f = "-87";
		String s = "*";
		String l = "4";
		/*
		String f = "94";
		String s = "+";
		String l = "72";
		*/
		
		//------this ends up in 2 copies of the same equation. Should maybe pass by reference to save duplicate memory consumption
		//number in the order of equations starts at 0
		Equation Eq = FileReader.GetEquation(File, 1);
		
		String fnum = Eq.getFirst();				
		String symbol = Eq.getSym();
		String lnum = Eq.getSecond();
		
		assertTrue(f.contentEquals(fnum));
		assertTrue(s.contentEquals(symbol));
		assertTrue(l.contentEquals(lnum));
	}
	//-------------------------no longer relevant tests 
/*
	@Test
	public void testGetFile() //add in ability to test a text file?
	{
		String Contents = FileReader.GetFile("/Users/C.J. Hammock/git/Project1/testing e+git/src/Equations.dat");
		assertTrue("Test1;good".contentEquals(Contents));//can't use assertEquals() because checks if same object, not same value
		//"test1;good" is what I am checking is being read in
	}
	
	@Test
	public void testGotParts() //add in ability to test a text file?
	{
		//allows easy change to test with different symbols / numbers
		String f = "7";
		String s = "+";
		String l = "3";
		
		String equation = f+s+l;
		String fnum = FileReader.GetFnum(equation);				
		String symbol = FileReader.GetSymbol(equation);
		String lnum = FileReader.GetLnum(equation);
		
		assertTrue(f.contentEquals(fnum));
		assertTrue(s.contentEquals(symbol));
		assertTrue(l.contentEquals(lnum));
*/	
	
	
	

}
