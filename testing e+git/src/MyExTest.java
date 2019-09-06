import static org.junit.Assert.*;

import org.junit.Test;

public class MyExTest {

	@Test
	public void testSum() //add in ability to test a text file?
	{
		int sum = MyEx.GetSum(1, 6);
		assertEquals(7, sum, 0);
		
		sum = MyEx.GetSum(-2, 4);
		assertEquals(2, sum, 0);
		
		sum = MyEx.GetSum(9, -15);
		assertEquals(-6, sum, 0);
		
		sum = MyEx.GetSum(-5, -23);
		assertEquals(-28, sum, 0);
		
	}
	@Test
	public void testDifference() //---------add in ability to test a text file?
	{
		int dif = MyEx.GetDifference(7, 2);
		assertEquals(5, dif, 0);
		
		dif = MyEx.GetDifference(18, 61);
		assertEquals(-43, dif, 0);
		
		dif = MyEx.GetDifference(-12, 6);
		assertEquals(-18, dif, 0);
		
		dif = MyEx.GetDifference(9, -73);
		assertEquals(82, dif, 0);
		
		dif = MyEx.GetDifference(-47, -51);
		assertEquals(4, dif, 0);
	}
	
	@Test
	public void testProduct() //---------add in ability to test a text file?
	{
		int pro = MyEx.GetProduct(4, 8);
		assertEquals(32, pro, 0);
		
		pro = MyEx.GetProduct(-51, 3);
		assertEquals(-153, pro, 0);
		
		pro = MyEx.GetProduct(62, -6);
		assertEquals(-372, pro, 0);
		
		pro = MyEx.GetProduct(-22, -16);
		assertEquals(352, pro, 0);
	}
	
	@Test
	public void testQuotient() //---------add in ability to test a text file?
	{
		int quo = MyEx.GetQuotient(18, 2);
		assertEquals(9, quo, 0);
		
		quo = MyEx.GetQuotient(49, 7);
		assertEquals(7, quo, 0);
		
		quo = MyEx.GetQuotient(8, 7);
		assertEquals(1, quo, 0);
		
		quo = MyEx.GetQuotient(12, 94);
		assertEquals(0, quo, 0);
		
		quo = MyEx.GetQuotient(-1261, 13);
		assertEquals(-97, quo, 0);
		
		quo = MyEx.GetQuotient( 777, -21);
		assertEquals(-37, quo, 0);
		
		quo = MyEx.GetQuotient( -324, -81);
		assertEquals(4, quo, 0);
	}
	

}
