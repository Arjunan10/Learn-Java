package threads;

 class A implements Runnable
 {
	  public void run() {
		  String var = "Hi, Im Arjunan D";
		 for(int i =0;i<4;i++) {
			 System.out.println(var);
			 try {Thread.sleep(1000);}catch(Exception e){} 
		  
	
		 }}}
	class Bun implements Runnable
	{

		public void run() {
			// TODO Auto-generated method stub
		 for(int i=0;i<4;i++) {
			 System.out.println("Im Learning \"JAVA\"");
	 
		 }}	}
 class B implements Runnable{
	 public void run() {
		  String var2 = " I Love Programming as well as Football";
			 for(int i =0;i<4;i++) {
				 System.out.println(var2);
				 try {Thread.sleep(1000);}catch(Exception e){} 
	 }
 }}
 public class MyThread {
	 public static void main(String[] args) throws InterruptedException {
		 Runnable t1 = new A();
		 Runnable t2 = new B();
		 Runnable t3 = new Bun();
		 Thread  x1 = new Thread(t1);
		 Thread x2 = new Thread(t2);
		 Thread x3 = new Thread(t3);
		 x1.start();
		 Thread.sleep(20);
		 x2.start();
		 Thread.sleep(10);
		 x3.start();
	 }
		
	}
 
		
