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
else if (grade >82 && grade < 87){System.out.println("Letter grade: B");}
else if (grade >79 && grade < 83){System.out.println("Letter grade: B-");}
else if (grade >76 && grade < 80){System.out.println("Letter grade: C+");}
else if (grade >72 && grade < 77){System.out.println("Letter grade: C");}
else if (grade >69 && grade < 73){System.out.println("Letter grade: C-");}
else if (grade >66 && grade < 70){System.out.println("Letter grade: D+");}
else if (grade >62 && grade < 67){System.out.println("Letter grade: D");}
else if (grade >59 && grade < 63){System.out.println("Letter grade: D-");}
else if ( grade < 60){System.out.println("Letter grade: F");}

System.out.println("Would you like to enter another grade?(y/n):");
choice = scan.next();


}



System.out.println("Thank you for using the Grade Converter App! Buh-bye!");




		}
}


