package pkgHelper;

import java.util.Arrays;


public class LatinSquare {
	
/*
 * Contains Zero : Complete
 * doesElementExist Complete
 * getColumn Complete
 * getRow Complete
 * hasAllValues Complete
 * hasDuplicates Complete
 * setLatinSquare Complete
 * getLatinSquare Complete
 * 
 * 	
 */
	
	// test git
	
	private int[][] LatinSquare;

	public LatinSquare() {
		//Constructor for LatinSquare (no arg)
		super();
			
	}

	
	public LatinSquare(int[][] puzzle) {
		//1 arg Constructor for LatinSquare
		super();
		LatinSquare = puzzle;
	}
	
	public boolean isLatinSquare() {
		LatinSquare Puz = new LatinSquare();
		Puz.getLatinSquare();
		Puz.ContainsZero();
		
		//But if it's not a LS...?
			
		return true;
	}
	
	

	public int[][] getLatinSquare() {
		// Method returns LatinSquare array
		return LatinSquare;
	}

	public void setLatinSquare(int[][] puzzle) {
		//Method sets LatinSquare array
		LatinSquare = puzzle;
	}
	
	
	public static boolean doesElementExist(int[] arr, int iValue)
	//Searches for a specific element in the array(iValue) and returns true if it exists and false if it doesn't
	{
	
	for(int x = 0; x < arr.length; x++) 
		{
	
		if (arr[x] == iValue) {
			return true;
			}
		}
	return false;
	}

	public static boolean hasDuplicates (int[] arr)
	{
		int [] arrCopy = Arrays.copyOf(arr, arr.length);
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length -1 ; i++) {
			if (arrCopy[i] == arrCopy[i+1])
			{
				return true;
			}
			
		}
		
		return false;
		
			
	}
	public boolean ContainsZero()
	{
		
	for( int i = 0; i < LatinSquare.length; i++) {
		for (int j = 0 ; j < LatinSquare.length; j++) {
				if (LatinSquare[i][j] == 0 ){
					return true;
				}
			}
		}
			
	return false;
	}
	
	int[] getColumn(int Column, int[][] testArray)
	{
	// Method returns LatinSquare Column
		int[] columnArray = Arrays.copyOf(testArray[Column], testArray.length);
	for (int Row=0; Row < testArray[Column].length; Row++) {
			columnArray[Row] = testArray[Row][Column];
		}

		return columnArray;
	
	}	

	int[] getRow(int Row, int[][] testArray)
	{
	// Method returns LatinSquare Row
	int [] rowArray = Arrays.copyOf(testArray[Row], testArray.length);
	for (int Column=0; Column < testArray[Row].length; Column++) {
			rowArray[Column] = testArray[Row][Column];
		}

	
		return rowArray;
	
	}	
	
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		// compares values from two arrays (Row and Column)
		
			
		
		
		boolean hasAllValues = true;//assume true, unless proven otherwise
		
		if (arr1.length != arr2.length) {//tests the length of the arrays.
			hasAllValues = false;
		}
		else {
		for (int j = 0; j < arr2.length; j++) {

		boolean bFound = false; //assumes false, unless loops prove otherwise.

		for (int i = 0; i < arr1.length; i++) {
		if (arr1[i] == arr2[j]) {
		bFound = true;
		break;
		}

		}
		if (bFound == false) {
		hasAllValues = false;
		break;
		}
		}
		}
		return hasAllValues;

		
	}
}
		

