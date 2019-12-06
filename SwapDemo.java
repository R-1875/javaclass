package com.slk.practice;

public class SwapDemo {
	
	
	
	static void swapper(int a,int b)
	{
		System.out.println("before swapping a= "+a+" b="+b       );
		
		
		int temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("after swapping a= "+a+" b="+b       );
	}

	public static void main(String[] args) {
		
		
		
		//SwapDemo obj=new SwapDemo();
		
		//obj.swapper(11, 12);
		
		swapper(11, 12);
		
		
		
		
		
		
	}

}
