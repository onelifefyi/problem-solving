//problem: https://codeforces.com/problemset/problem/1111/A

import java.util.Scanner;
public class SuperHero{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char[] arr1 = sObj.nextLine().toCharArray();
        char[] arr2 = sObj.nextLine().toCharArray(); 
        String vov = "aeiou";

        if(arr1.length != arr2.length){
            System.out.println("No");
            return;
        }
        for(int i=0; i<arr1.length; i++){
            if(vov.contains(Character.toString(arr1[i])) != vov.contains(Character.toString(arr2[i]))){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}