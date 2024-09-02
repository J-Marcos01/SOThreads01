package view;

import controller.Ex01Thread;

public class Principal 
{

	public static void main(String[] args)
	{
		
		for(int i=0;i<5;i++)
			{
			Ex01Thread op = new Ex01Thread();
			op.start();
			}
	}

}
