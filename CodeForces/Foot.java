// https://codeforces.com/problemset/problem/43/A


// 20 10 15 10 10 20 15 20

//input:
// 5
// A
// ABA
// ABA
// A
// A

import java.util.Scanner;
import java.util.HashMap;
public class Foot{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        // n (first input) implies the number of goals/ input lines given
        // here n is 5
        int n = sObj.nextInt();
        sObj.nextLine();
        HashMap<String, Integer> momoGoalMap = new HashMap<String, Integer>();
        // for each input line i.e, A, ABA, ABA, A, A (0 -> 5)
        for(int i=0; i<n; i++){
            // to put team into the hashmap  
            String team = sObj.nextLine();
            if(momoGoalMap.containsKey(team)){
                momoGoalMap.put(team, momoGoalMap.get(team)+1);
            }
            else{
                momoGoalMap.put(team, 1);
            }
        }
        int goals = 0;
        String winner = " ";
        for(String str: momoGoalMap.keySet()){
            if(momoGoalMap.get(str) > goals){
                winner = str;   // winner = 'A'
                goals = momoGoalMap.get(str);   // goals = 3
            }
        }
        System.out.println(winner);
    }
}
// momoGoalMap 
// {'A':3, 'ABA':2}
// {'A':3, 'ABA':2}