public class TaskThreadTest
{
	
	//https://www.w3schools.com/java/java_interface.asp
	public static void main(String[] args)
	{
		//Create tasks
		Runnable printA = new PrintChar('a', 100);
		Runnable printB = new PrintChar('b', 100);
		Runnable print100 = new PrintNum(100);

		//Create threads
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);
		
		//Start threads
		thread1.start();
		thread2.start();
		thread3.start();
	}
}




//The type PrintChar must implement the inherited abstract method Runnable.run()
class PrintChar implements Runnable
{
	private char charToPrint;
	private int count;
	
	public PrintChar(char p, int c)
	{
		charToPrint = p;
		count = c;
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i < count; i++)
		{
			System.out.println(charToPrint);
		}
	}
}

	
class PrintNum implements Runnable
{
	private int count;

	public PrintNum(int print100)
	{
		count = print100;
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i < count; i++)
			System.out.println(" " + i);
	}
}
