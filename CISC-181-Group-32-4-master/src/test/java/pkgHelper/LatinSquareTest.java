package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
/*Tests completed:
  doesElementExistTests 1,2
 */

public class LatinSquareTest {

	@Test
	public void doesElementExist_Test() {
		
		int [] arr = {1,2,3,4,5};
		int iValue = 5;
		boolean bExpected = true;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);
		
		assertEquals(bExpected, bActual);
	}
	@Test
	public void doesElementExist_Test2() {
		
		int [] arr = {1,2,3,4,5};
		int iValue = 6;
		boolean bExpected = false;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);
		
		assertEquals(bExpected, bActual);
	}
	
	@Test
	public void hasDuplicates_test1() {
		int [] arr = {1,2,3,4,5};
		boolean bExpected = false;
		boolean bActual = LatinSquare.hasDuplicates(arr);
		
		assertEquals(bExpected, bActual);
	}
	@Test
	public void hasDuplicates_test2() {
		int [] arr = {1,2,3,4,4};
		boolean bExpected = true;
		boolean bActual = LatinSquare.hasDuplicates(arr);
		
		assertEquals(bExpected, bActual);
	}
	
	@Test //Added by Ryan
	public void hasAllValues_Test1() {
		int [] tarr1 = {1,2,3,4,5};
		int [] tarr2 = {1,2,3,4,5};
		boolean expectedBool = true;
		boolean actualBool = LatinSquare.hasAllValues(tarr1, tarr2);
		
		assertEquals(expectedBool,actualBool);
		
	}
	@Test //Added by Ryan
	public void hasAllValues_Test2() {
		int [] tarr1 = {1,2,3,4};
		int [] tarr2 = {1,2,3,6,5};
		boolean expectedBool = false;
		boolean actualBool = LatinSquare.hasAllValues(tarr1, tarr2);
		
		assertEquals(expectedBool,actualBool);
		
	}
	
	
	
} 

