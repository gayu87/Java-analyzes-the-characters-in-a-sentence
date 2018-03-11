/**********************************************************************************
 
//
// Title:      characters in a sentence 
// Course:     CSC 3020
// Homework:   2-2
// Author:     Gayatari patel
// Date:       28 September 2016
// Description:
//   This Java application that analyzes the characters in a sentence 
//
//**********************************************************************************
 */

package WSU.characters_in_sentence;

//Import classes
import java.util.Scanner;

// class characters_in_sentence
public class characters_in_sentence 
{
    
    //----------------------------------------------------------------
    // main
    //----------------------------------------------------------------
    public static void main (String[] args)
    {
    	
    	
    	// variable for input sentence
    	String enter=" ";  
    	Scanner keyboard = new Scanner(System.in); 
    	
    	// prints application header
    	 System.out.println("\nWelcome to Character counting Method");
         System.out.println("*************************************\n");
         // while loop
         while (enter!="x")
     	{
    	System.out.print("Enter The sentence: ");
    	// user input sentence 
    	enter=keyboard.nextLine(); 
    	System.out.println();
    	   // using if statement to break when user enter X
    		if (enter.equals("x"))
    		{
    			System.out.println("You Break the program");
    			break;
    		}
    	
    	//System.out.println();
    	System.out.printf("%-47s%10s\n","The sentence :", enter );
    	
    	
    	// variables to increment number 
    	int counter = 0,counter1=0, counter2=0,counter3=0;
    	
    	//using for loop to count number of letter, digits, whitespace and other character
        for (int i = 0; i < enter.length(); i++)
        {
          if (Character.isLetter(enter.charAt(i)))
            counter++;
          else if (Character.isDigit(enter.charAt(i)))
        	  counter1++;
          else  if (Character.isWhitespace(enter.charAt(i)))
        	  counter2++;
          else
        	  counter3++;
        }
        // print number of letter, digits, whitespace and other character
        System.out.printf("%-47s%10d\n","letters:", counter );
        System.out.printf("%-47s%10d\n","digits:", counter1 );
        System.out.printf("%-47s%10d\n","Whitespace::", counter2 );
        System.out.printf("%-47s%10d\n","other characters:", counter3 );
        System.out.printf("%-47s%9d\n","The total number of characters in the sentence: ",enter.length());
        System.out.println();
        System.out.println("\nEnd of the counting charater of the sentance that you entered above");
        System.out.println("**********************************************************************\n");
        System.out.println();
   }
    	
    	 keyboard.close();
    	
    }
	
}