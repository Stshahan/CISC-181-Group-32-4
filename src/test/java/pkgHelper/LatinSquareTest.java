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
	
	@Test 
	public void hasAllValues_Test1() {
		int [] tarr1 = {1,2,3,4,5};
		int [] tarr2 = {1,2,3,4,5};
		boolean expectedBool = true;
		boolean actualBool = LatinSquare.hasAllValues(tarr1, tarr2);
		
		assertEquals(expectedBool,actualBool);
		
	}
	@Test 
	public void hasAllValues_Test2() {
		int [] tarr1 = {1,2,3,4};
		int [] tarr2 = {1,2,3,6,5};
		boolean expectedBool = false;
		boolean actualBool = LatinSquare.hasAllValues(tarr1, tarr2);
		
		assertEquals(expectedBool,actualBool);
		
	}
	@Test
	public void getColumn_Test1() {
		
		int testCol = 2;
		int [][] puzzle = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare testLatinSquare = new LatinSquare();
		testLatinSquare.setLatinSquare(puzzle);
		int [] expectedArray = {3,1,2};
		int [] actualArray = testLatinSquare.getColumn(testCol);
			
		boolean expectedBool = true;
		boolean actualBool = Arrays.equals(expectedArray, actualArray) ;
		
		assertEquals(expectedBool,actualBool);
		
	
	}
	@Test
	public void getColumn_Test2() {
		
		int testCol = 2;
		int [][] puzzle = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare testLatinSquare = new LatinSquare();
		testLatinSquare.setLatinSquare(puzzle);
		int [] expectedArray = {3,1,2};
		int [] actualArray = testLatinSquare.getColumn(testCol);
			
		boolean expectedBool = true;
		boolean actualBool = Arrays.equals(expectedArray, actualArray) ;
		
		assertEquals(expectedBool,actualBool);
		
	
	}
	
	
	@Test  
	public void getRow_Test1() {
		
		int testRow = 2;
		int [][] puzzle = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare testLatinSquare = new LatinSquare();
		testLatinSquare.setLatinSquare(puzzle);
		int [] expectedArray = {3,2,1};
		int [] actualArray = testLatinSquare.getRow(testRow);
				
		boolean expectedBool = false;
		boolean actualBool = Arrays.equals(expectedArray, actualArray) ;
		
		assertEquals(expectedBool,actualBool);
	}
	@Test  
	public void getRow_Test2() {
		
		int testRow = 2;
		int [][] puzzle = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare testLatinSquare = new LatinSquare();
		testLatinSquare.setLatinSquare(puzzle);
		int [] expectedArray = {3,1,2};
		int [] actualArray = testLatinSquare.getRow(testRow);
				
		boolean expectedBool = true;
		boolean actualBool = Arrays.equals(expectedArray, actualArray) ;
		
		assertEquals(expectedBool,actualBool);
	}
	
	@Test  
	public void isLatinSquare_Test() {
		
		int [][] puzzle = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare testLatinSquare = new LatinSquare();
		testLatinSquare.setLatinSquare(puzzle);
						
		
		boolean expectedBool = true;
		boolean actualBool = testLatinSquare.isLatinSquare();
		
		
		assertEquals(expectedBool,actualBool);
	
}
	@Test  
	public void isLatinSquare_Test2() {
		
		int [][] puzzle = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare testLatinSquare = new LatinSquare();
		testLatinSquare.setLatinSquare(puzzle);
		
		boolean expectedBool = false;
		boolean actualBool = testLatinSquare.isLatinSquare();
		
		
		assertEquals(expectedBool,actualBool);
	
}
	
}

