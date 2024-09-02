package controller;

public class Ex01Thread extends Thread 
{
	 public Ex01Thread ()
	 {
		 super();
	 }
	
	 public void run()
	 {
		int tid=(int) threadId();
		System.out.println("TID : " + tid);
		
		 		 
	 }
	
}
