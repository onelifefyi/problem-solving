// problem: https://codeforces.com/problemset/problem/378/A

import java.util.Scanner;
import java.lang.Math;
public class PlayingDice{
	public static void main(String[] args){
		Scanner sObj = new Scanner(System.in);
		int a = sObj.nextInt();
		int b = sObj.nextInt();
		int aWin = 0;
		int draw = 0;
		int bWin = 0;
		for(int i=1; i<=6; i++){
			if(Math.abs(a-i) > Math.abs(b-i)){
			bWin++;
			}
			else if(Math.abs(a-i) < Math.abs(b-i)){
			aWin++;
			}
			else{
			draw++;
			}
		}
	       System.out.print(aWin + " " + draw + " " + bWin);	
	}
}
