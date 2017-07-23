package com.manoj.dp.strategy;

public class Test {

	public static void main(String[] a){
		
		int[] data = {1,3,5,2,54,3,643,46,90};
		
		Context context = new Context(new BubbleSort());
		context.arrange(data);
		
		context = new Context(new QuickSort());
		context.arrange(data);
		
		context = new Context(new MergeSort());
		context.arrange(data);
	}
}

