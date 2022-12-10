package Module_6;

public class DealerThread {
	public static void main(String args[])
	{
		Thread T1 = new Thread(new ManagerThread());
		Thread T2 = new Thread(new ManufacturerThread());
		
		T1.start();
		T2.start();
	}
}
