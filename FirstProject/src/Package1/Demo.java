package Package1;

import java.util.Random;

public class Demo
{
	public static void main(String[] args)
	{
		System.out.println("My name is Hateem");
		System.out.println("generation of random numbers");
		
		Random random = new Random();
		int number = random.nextInt(1000);
		System.out.println(number);
		//for getting 4 digit every time we write logic
		if(number < 1000)
		{
			//convert 1/2/3 digit number into 4 digit number
			number +=1000;
			
		}
		System.out.println("otp is "+number);
	}

}
