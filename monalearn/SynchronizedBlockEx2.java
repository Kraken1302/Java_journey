package monalearn;

class ProductNo
{
	public void printProduct(int n)
	{
	System.out.println("We are going to calculate product of "+ n);	
		
	synchronized (this) {
		for(int i=1;i<=5;i++)	
		{	
		System.out.println(n*i);
		try {
			Thread.sleep(500);
		}catch (Exception e) {
			System.out.println(e);
		}
		}	
	}
	
	System.out.println("Thank you for visiting this method");
		
	}

}

public class SynchronizedBlockEx2 {

	public static void main(String[] args) {
		ProductNo obj=new ProductNo();
		
		new Thread() {
			
		public void run()	
		{
			obj.printProduct(5);
		}
		}.start();
		
		new Thread() {
			
			public void run()	
			{
				obj.printProduct(100);
			}
			}.start();
	}

}
