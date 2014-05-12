//Robert Payne
//L02
//6-13-2012
//Lab 9 Task 2
//This program creates a list of songs for a CD by reading from a file
import java.io.*;
import java.util.Scanner;

public class CompactDisc
{
   public static void main(String [] args) throws IOException
   {
      File file = new File("Classics.txt");
      Scanner input = new Scanner(file);
      String title;
      String artist;
      
      //Declare an array of songs, called cd, of size 6
      Song[] cd = new Song[6];
		
      for (int i = 0; i < cd.length; i++)
      {
         title = input.nextLine();
         artist = input.nextLine(); 
         // fill the array by creating a new song with          
			// the title and artist and storing it in the 
         // appropriate position in the array
			cd[i] = new Song(title, artist);
      }
      
      System.out.println("Contents of Classics:");
      for (int i = 0; i < cd.length; i++)
      {
         //print the contents of the array to the console
			System.out.print(cd[i].toString());
      }
   }
}