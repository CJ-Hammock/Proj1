import static org.junit.Assert.*;
import org.junit.Test;

public class FileReaderTest {

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
	}
	
	

}
