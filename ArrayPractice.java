//Robert Payne
//L02
//6-13-2012
//Lab 9 Task 3
import java.util.Scanner;

public class ArrayPractice{

	public static void main(String[] args)
	{
		//Scanner object
		Scanner userInput = new Scanner(System.in);
		
		//Variable Declarations
		int[][] table = new int[3][4]; //2D array with 3 rows and 4 columns
		int row;	//represents the row
		int col;	//represents the column
		int sum = 0;	//stores the sum of elements
		
		//nested for-loop to get input from the user to fill the array
		for(row = 0; row < 3; row++)
		{
			for(col = 0; col < 4; col++)
			{
				System.out.println("Enter an int for [" + row + "][" + col + "]: ");
				table[row][col] = userInput.nextInt();
				
			}
		}
		
		//outputs the table by rows and columns
		for(row = 0; row < 3; row++)
		{
			for(col = 0; col < 4; col++)
			{
				System.out.print(table[row][col] + "\t");
				
			}
			System.out.println();
		}
		
		//adds two elements together and outputs the sum
		sum = table[0][2] + table[1][0];
		System.out.println(" table[0][2] + table[1][0] = " + sum);
		
		//reinitialize the sum before taking the sum of the entire table
		sum = 0;
		
		//adds up all of the elements in the table
		for(row = 0; row < 3; row++)
		{
			for(col = 0; col < 4; col++)
				sum += table[row][col];
		}
		
		//outputs the sum of all the elements
		System.out.println("The sum of the table is: " + sum);
	}
}
		