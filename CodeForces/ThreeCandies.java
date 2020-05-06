// problem: https://codeforces.com/problemset/problem/1196/A

import java.util.Scanner;
public class ThreeCandies{
	public static void main(String[] args){
		Scanner sObj = new Scanner(System.in);	
		int n = Integer.parseInt(sObj.nextLine());
		long sum = 0;
		for(int i=0; i<n; i++){
			sum = 0;
			sum += sObj.nextLong() + sObj.nextLong() + sObj.nextLong();
		        sObj.nextLine();
			System.out.println(sum/2);	
		}		
	}
}
