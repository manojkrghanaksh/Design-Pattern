package com.manoj.dp.strategy;

public class Context {

	private final SortStrategy sortStrategy;
	
	public Context(SortStrategy sortStrategy){
		this.sortStrategy = sortStrategy;
	}
	
	public void arrange(int[] data){
		sortStrategy.sort(data);
	}
}
