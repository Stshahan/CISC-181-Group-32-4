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
	
	private int[][] LatinSquare; // instance variable

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
		// need to separate into rows and columns
		Puz.getLatinSquare();
		Puz.ContainsZero();
		
		
		
		
		//But if it's not a LS...? must call hasDuplicates
			
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
	
	public int[] getColumn(int iCol)
	{
	// Method returns LatinSquare Column
		int[] columnArray = new int [this.LatinSquare.length];
	for (int Row=0; Row < this.LatinSquare.length; Row++) {
			columnArray[Row] = LatinSquare[Row][iCol];
		}
		return columnArray;
		}	

	public int[] getRow(int iRow)
	{
	// Method returns LatinSquare Row
		int [] rowArray = new int [this.LatinSquare.length];
	
		rowArray = this.LatinSquare[iRow];
	
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
		

