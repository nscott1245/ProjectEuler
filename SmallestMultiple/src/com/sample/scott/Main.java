package com.sample.scott;

public class Main {

	public static void main(String[] args) {
		
		boolean found = false;
		int incrementor = 2;
		int stop;
		
		while(!found){
			
			stop = 20 * incrementor;
			
			for(int i=19;i>=2;i--){
				
				if(stop%i != 0){
					found=false;
					break;
				}else{
					found = true;
				}
			}
			
			if(found){
				System.out.println("Answer: " + stop);
			}
			
			incrementor = incrementor + 1;
			
		}

	}

}
