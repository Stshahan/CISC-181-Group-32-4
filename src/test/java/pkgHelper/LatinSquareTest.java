package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

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
	
	
	
}
