/*Problem: String Rotation: Assume you have a method isSubst ring which checks if one word is a substring
of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").
Hints: #34, #88, #104
j */

//Approach: 1) I can take the first character and then traverse the second string, whenever I find 
             // I find a match, I can iterate through the second array and first array to check if
             // they match.   time: O(N^2)

//          2) One cool thing is that if we add the string twice, eg s1 = Water; s2 = erWat
            // adding twice s2 = erWat + erWat = erWaterWat; now we can find the string
            // this also takes O(N + N*2) = O(N)

import java.util.Scanner;
public class SubString{

    public static boolean isSub(String s1, String s2){     //O(N) assuming contains() takes O(N+M)
        StringBuilder SB = new StringBuilder();
        SB.append(s2);  SB.append(s2);
        return SB.toString().contains(s1);
    }

    // public static boolean isSub(String s1, String s2){      //My implementation O(N^2)
    //     char c = s1.charAt(0);
    //     boolean found;
    //     for(int i=0; i<s2.length(); i++){                   
    //         found = true;
    //         if(s2.charAt(i) == c){
    //             for(int a=0, b=i; b<i+s2.length(); b++,a++){      // O(N^2)
    //                 if(s1.charAt(a) == s2.charAt(b%s2.length())) continue;
    //                 else{
    //                     found = false;
    //                     break;
    //                 }
    //             }
    //             if(found){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String s1 = sObj.nextLine();
        String s2 = sObj.nextLine();
        System.out.println(isSub(s1, s2));
    }
}