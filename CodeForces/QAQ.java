// problem: https://codeforces.com/problemset/problem/894/A
import java.util.Scanner;
public class QAQ{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char[] input = sObj.nextLine().toCharArray();
        int count = 0;
        for(int i=0; i<input.length-2; i++){
            if(input[i] == 'Q'){
                for(int j=i+1; j<input.length; j++){
                    if(input[j] == 'A'){
                        for(int k=j+1; k<input.length; k++){
                            if(input[k] == 'Q'){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}