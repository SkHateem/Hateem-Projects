package AllLevelOfThread;

public class FourthThreadProgram implements Runnable
{
	public void run()
	{
		System.out.println("this is the fourth thread program");
	}
	public static void main(String[] args)
	{
		Runnable r1 = new FourthThreadProgram();
		Thread t1 = new Thread(r1,"This is the creation of reference of interface");
		String str = t1.getName();
		System.out.println(str);
	}

}
