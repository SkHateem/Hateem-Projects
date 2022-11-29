package AllLevelOfThread;

public class SecondThreadProgram implements Runnable
{
	public void run()
	{
		System.out.println("this ia a thread program implementing the runable class");
	}
	public static void main(String[] args)
	{
		SecondThreadProgram stp = new SecondThreadProgram();
		Thread t1 = new Thread(stp);
		t1.start();
		
	}

}
