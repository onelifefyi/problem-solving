//problem: https://codeforces.com/problemset/problem/1230/B

import java.util.Scanner;
public class Ania{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int size = sObj.nextInt();
        int toChange = sObj.nextInt();
        int arr[] = new int[size];
        sObj.nextLine();
        int i = 0;
        for(char c: sObj.nextLine().toCharArray()){
            arr[i] = Integer.parseInt(String.valueOf(c));
            i++;
        }

        if(toChange == 0){
            for(int ele: arr){
                System.out.print(ele);
            }
            return;
        }

        if(size == 1){
            System.out.println(0);
            return;
        }
        if(arr[0] > 1){
            arr[0] = 1;
            toChange--;
        }
        for(int j=1; j<size; j++){
            if(toChange == 0){
                break;
            }
            if(arr[j] > 0){
                arr[j] = 0;
                toChange--;
            }
        }
        for(int ele: arr){
            System.out.print(ele);
        }
    }
}