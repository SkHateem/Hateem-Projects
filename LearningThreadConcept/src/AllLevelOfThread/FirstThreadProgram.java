package AllLevelOfThread;

public class FirstThreadProgram extends Thread
{
	public void run()
	{
		System.out.println("this is the first thread program");
	}
	public static void main(String[] args) 
	{
		FirstThreadProgram ftp = new FirstThreadProgram();
		ftp.start();
		
	}

}
