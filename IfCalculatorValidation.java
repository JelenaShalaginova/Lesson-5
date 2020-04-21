package lesson5;

import java.util.*;

import lesson4.SimpleCalculator;

public class IfCalculatorValidation {

	public static void main(String[] args) {
		//input
		//prompt user to specify the operation to be performed
		System.out.println("Choose operation !");
		System.out.println("addition -- 1:");
		System.out.println("substraction -- 2");
		System.out.println("multiplication -- 3");
		System.out.println("devision -- 4");
		
		//declare and create an object of type Scanner
		Scanner input = new Scanner(System.in);
		
		//declare a local variable to store the users choice
		int operations = input.nextInt();//read and return 1 int value
		
		if (operations != 1 && operations != 2 && operations !=3 && operations !=4) {
			System.out.println("Check your operations numbers .");
		}else {//otherwise, if operation is valid execute next statement{body}
			System.out.println("Please enter 1st number: ");
			int n1 = input.nextInt();
			
			System.out.println("Please enter 2nd number: ");
			int n2 = input.nextInt();
			
			//declare and create type of object SimpleCalculator
			SimpleCalculator myCalc = new SimpleCalculator();
			
			//use the setter method to store the value n1 to the firstNumber of instance variable
			myCalc.setFirstNumber(n1);
			
			//use the setter mathod to store the value n1 to the secondNumber of instance variable
			myCalc.setSecondNumber(n2);
			
			//process
			if(operations == 1) {
				//call add() method of the object to perform the addition
				myCalc.add();
				
			}else if(operations == 2) {
				//call substract() method of the object to perform the substract
				
			}else if(operations == 3) {
				//call multiply() method of the object to perform the multiply
				
			}else if(operations == 4) {
				//call divide() method of the object to perform the division
				
			}
			
			//output
			double res = myCalc.getResult();
			System.out.println("Result: "+ res);
			
			
			
			
			
		}//end else
	}
}
