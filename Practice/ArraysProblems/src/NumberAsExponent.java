/*
 * Given a positive integer N, return true if there exist 2 integers x and y with following conditions:
 * 1. N = x^y
 * 2. x > 0
 * 3. y > 1
 * If no such x and y can be found for the given integer N, then return false.
 */

import java.util.Scanner;

public class NumberAsExponent {

	
	public static void main(String args[]){
		
		System.out.println("Enter a number to check if it can be expressed as x raised to y");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		NumberAsExponent o  = new NumberAsExponent();
		boolean res= o.check(n);
		System.out.println(res);
	}

	private boolean check(int n) {
		
		int k = (int) Math.sqrt(n);
		boolean res=false;
		
		int r=0;
		int q;
		for(int i = k ; i>1;i--){
			q= n/i;
			r= n%i;
			if(r==0){
				 res = div(q,i);
				 if(res == true)
					 break;
			}
		}

		
		
		
		return res;
		
	}
	
	private boolean div(int n,int k){
		
		int q = n;
		int r = 0;
		boolean res = true;
		while(q>0&&r==0){
			if(q==1){
				break;
			}
			r= q%k;
			q = q/k;
			if(r!=0)
				res = false;
		}
		return res;
	}
}
