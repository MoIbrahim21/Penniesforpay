import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Mo Ibrahim
 * Pd 5 Intro to Java
 * 
 */
public class Rollingdice {

	public static void main(String[] args) 
	{
		Random jawn = new Random();
		Scanner num = new Scanner(System.in);
		int rolling=(jawn.nextInt(6)+1);
		System.out.println("How many times are you planning on rolling the dice?: ");
		int numberrolled=num.nextInt();
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		int num6=0;
		for(int i=0; i!=numberrolled;i++)
		{
			rolling= (jawn.nextInt(6)+1);
			System.out.println(rolling);
			switch(rolling)
			{
			case 1:
				num1=num1+1;
				break;
			case 2:
				num2=num2+1;
				break;
			case 3:
				num3=num3+1;
				break;
			case 4:
				num4=num4+1;
				break;
			case 5:
				num5=num5+1;
				break;
			default:
				num6=num6+1;
				break;
			
			}
		}
		System.out.println("\nNumber 1 came out " +num1+" times");
		System.out.println("\nNumber 2 came out " +num2+" times");
		System.out.println("\nNumber 3 came out " +num3+" times");
		System.out.println("\nNumber 4 came out " +num4+" times");
		System.out.println("\nNumber 5 came out " +num5+" times");
		System.out.println("\nNumber 6 came out " +num6+" times");
	}
	

}
