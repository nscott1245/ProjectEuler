package com.sample.scott;

public class Application {

	
	public static void main(String[] args) {
		
		int max = 1000;
		int value = findTheSum(max);
		
	    System.out.println("Sum of multiples: " + value);
	}
	
	public static int findTheSum(int max){
	
		int val = 0;
		int val1=3;
		int val2=5;
			
		for(int i=3;i<max;i++){
			
			if((i%val1 == 0) || (i%val2==0)){
			  val = val + i;
			}
		}
		
		return val;
	}

}
