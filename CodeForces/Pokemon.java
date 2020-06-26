//problem: https://codeforces.com/problemset/problem/452/A

import java.util.Scanner;
public class Pokemon{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String[] catalogue = "vaporeon jolteon flareon espeon umbreon leafeon glaceon sylveon".split(" ");
        int length = Integer.parseInt(sObj.nextLine());
        String input = sObj.nextLine();
        boolean isCorrect = true;
        for(String st: catalogue){
            isCorrect = true;
            if(length == st.length()){
                //System.out.println("Checking for: " + st);
                for(int i=0; i<length; i++){
                    if(input.charAt(i) == '.'){
                        //System.out.println("_ at: " + i);
                        continue;
                    }
                    else if(input.charAt(i) != st.charAt(i)){
                        isCorrect = false;
                        break;
                    }
                }
                if(isCorrect){
                    System.out.println(st);
                    return;
                }
            }
        }
    }
}