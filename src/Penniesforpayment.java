import java.util.Scanner;

/**
 * 
 * @author Mo Ibrahim 
 *Pd 5 Intro to Java
 */
public class Penniesforpayment {

	public static void main(String[] args)
	{
		Scanner user = new Scanner(System.in);
		System.out.println("Please enter number of days worked: ");
		int workingdays = user.nextInt();
		double payment = .01;
		
		System.out.println("workingdays\tpayment");
		System.out.println("_________" );
		for (int day=1; day<=workingdays;day++)
		{
			payment*=2;
			System.out.println(day+"\t"+payment);
		}
		
	}
	

}
