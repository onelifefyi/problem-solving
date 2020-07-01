/*problem: URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string.*/

import java.util.Scanner;
public class URLify{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        StringBuilder SB = new StringBuilder();
        String[] sArr = sObj.nextLine().split(" ");
        for(String str: sArr){
            SB.append(str + "%20");
        }
        System.out.println(SB);
    }
}