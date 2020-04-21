package lesson5;


/* Home Work: 
  Write an application that prompts a student to input a day of the week, and then it will display whether there are classes scheduled for that day.
// Day        Message
// Monday:	Evening classes at 19:00
Tuesday:   No classes
Wednesday:	Evening classes at 19:00
Thursday:  No classes
Friday:	No classes
Saturday:	Whole day Labs :// Sunday:	It's finally Sunday! : default:   check your input mate/fella/gal
*/



import java.util.Scanner;

public class SwitchDays {
   public static void main(String args[]) {
	   
	   int day;
       // declare a variable to store the day entered by the user
	   //String day;
	   
       // declare a variable named scan to be able to work with objects of type Scanner
	   Scanner sc = new Scanner(System.in);
	   
       // create a Scanner object to read input from the keyboard
       // prompt the user to enter a day of the week
	   System.out.println("Please enter a day (as a number i.e. 1-7) of the week to see whether there are any classes scheduled for that day");
	   
       // read the string provided by the user
	   //day = sc.next();
	   day = sc.nextInt();
	   
       // Java is case sensitive, therefore let's convert the word provided by the user to lower case 
	   //so that the program works independent of the way the user writes the word 
	   //e.g. Monday, monDAY, MoNdAy
	   
       //switch
	   
	   switch (day) {
	   case 1:
	   case 3:
		   System.out.println("Evening classes at 19:00");
		   break;
	   case 2:
	   case 4:
	   case 5: 
		   System.out.println("No classes");
		   break;
	   case 6:
		   System.out.println("Whole day labs");
		   break;
	   case 7:
		   System.out.println("It's finally Sunday!!!");
		   break;
		default:
			System.out.println("check your input mate/fella/gal");
	
	   }
   }
}



