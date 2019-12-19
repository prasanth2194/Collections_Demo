package com.prasanth.divisor;

import java.util.Scanner;

public class Divisor implements Divisorint {

	@Override
	public void divisor(int n) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		int s=0;
		for(int i = 1;i<=n;i++){
			while(n%i==0){
				System.out.print("Divisor of given number:"+i+"\t");
				s=s+i;
				
				break;
			}
			
			
		}
		
		System.out.println("Sum of the Divisor:"+s);
		
	}

}
