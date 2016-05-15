/*Developer: Danielle H.
Date: 5/15/2016
Task: Convert given number to letter grade
*/

package gradeConverter;
import java.util.*;
public class GradeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice = "y";
		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome to the Letter Grade Converter!");
		while (choice.equalsIgnoreCase("y") ){
System.out.println("Enter a numerical grade (0-100):");
int grade = scan.nextInt();
if (grade > 92){ System.out.println("Letter grade: A");}
else if (grade >89 && grade < 93){System.out.println("Letter grade: A-");}
else if (grade >86 && grade < 90){System.out.println("Letter grade: B+");}

}








		}
}


