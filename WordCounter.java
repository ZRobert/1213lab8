//Robert Payne
//L02
//6-13-2012
//Lab 9 Task 1
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounter
{
	public static void main(String[] args)
	{
		//make scanner obj
		Scanner userInput = new Scanner (System.in);
		//declare input variable
		String inputStr;
		int numOfWords;
		do{
			//user input
			System.out.println("Enter a string(\"XXX\" to exit): ");
			inputStr = userInput.nextLine();
			
			//makes string tokenizer obj and gets the number of words in the string
			StringTokenizer tokens = new StringTokenizer(inputStr);
			numOfWords = tokens.countTokens();
			
			//print the number of words
			System.out.println("Your string contained " + numOfWords + " words.");
			
		}while(inputStr.compareTo("XXX") != 0);//loops until user inputs 'XXX'
		
	}
}