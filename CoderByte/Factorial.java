/*Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it.*/

import java.util.Scanner;

public class Factorial{

	static int FirstFactorial(int num){
		int res = 1;
		for(int i = num; i>1; i--){
			res *= i;
		}
		return res;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		System.out.println(FirstFactorial(input));
	}

}
