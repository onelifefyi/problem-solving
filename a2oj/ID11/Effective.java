// problem #30: https://codeforces.com/problemset/problem/227/B
// Getting time exceeded, need to improve this
import java.util.Scanner;
public class Effective {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int[] input = new int[n];
        for(int css=0; css<n; css++) input[css] = sObj.nextInt();
        int nn = sObj.nextInt();
        int[] qrs = new int[nn];
        for(int i=0; i<nn; i++) qrs[i] = sObj.nextInt();
        int vas = 0;
        int pet = 0;
        int temp;
        for(int ele: qrs){
            temp=0;
            for(int ii=0; ii<n; ii++){
                if(input[ii] == ele){
                    temp++;
                    break;
                }
                temp++;
            }
            vas += temp;
            pet += n-temp+1;
        }
        System.out.println(vas + " " + pet);
        sObj.close();
    }
}
