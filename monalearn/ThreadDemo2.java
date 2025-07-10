package monalearn;


class Hi extends Thread
{
	public Hi(String name)
	{
		super(name);
	}
	public void run() {
	for(int i=1;i<=5;i++) //hi- i=1<=5y hi i=2<=5 hi
	{
		System.out.println(Thread.currentThread().getName()+": Hi");
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	}
}
//Thread-0 Thread-1 
class Hello extends Thread
{
	public Hello(String name)
	{
		super(name);
	}
	public void run() {
	for(int i=1;i<=5;i++) //hello i=1<=5y hello i=2<=5y hello
	{
		System.out.println(Thread.currentThread().getName()+": Hello");
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		Hi hi=new Hi("Thread-Hi");//new state-born
		Hello hello=new Hello("Thread-Hello");//new state-born
//		hi.setName("Hi");
//		hello.setName("Hello");
		hi.start();//runnable state
		hello.start();//runnable state -choose by scheduler
		System.out.println(hi.getPriority());
		System.out.println(hello.getPriority());
	}

}
