package Package1;

import java.util.Random;
import java.util.Scanner;

public class Generate6DigitOTP
{
	public static void main(String[] args)
	{
		Random random = new Random();
		int number = random.nextInt(100000);
		System.out.println(number);
		if(number < 100000)
		{
			number += 100000;
		}
		System.out.println(number);
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value:");
		int a = scanner.nextInt();
		if(number == a)
		{
			System.out.println("otp verified");
			
		}
		else {
			System.out.println("invalid otp");
		}
		
	}

}
