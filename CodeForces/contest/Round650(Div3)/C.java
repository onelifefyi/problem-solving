import java.util.Scanner;
import java.util.ArrayList;
public class C{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = Integer.parseInt(sObj.nextLine());
        for(int z=0; z<nos; z++){
            int tables = sObj.nextInt();
            int dist = sObj.nextInt();
            sObj.nextLine();
            char arr[] = sObj.nextLine().toCharArray();
            for(int i=0; i<tables; i++){
                if(arr[i] == '1'){
                    for(int x=1; (x<=dist) && (x+i < tables); x++){
                        arr[i+x] = '~';
                    }
                    for(int y=-1; (y>=-dist) && (y+i>=0); y--){
                        arr[i+y] = '~';
                    }
                }
            }
            int zerCnt = 0;
            ArrayList<Integer> aLst = new  ArrayList<Integer>();
            for(int pp = 0; pp< tables; pp++){
                if(arr[pp] == '0'){
                    for(int aaa=0; (aaa + pp)< tables; aaa++){
                        if(arr[aaa+pp] != '0'){
                            aLst.add(zerCnt);
                            zerCnt=0;
                            pp += aaa+1;
                        }
                        else{
                            zerCnt++;
                        }
                    }
                }
            }

            int total = 0;
            for(int ele: aLst){
                //System.out.println(ele);
                total += (ele + (ele%2)) / (dist+1);
            }
            System.out.println(total);


            // for(char ch: arr){
            //     System.out.print(ch);
            // }
        }
    }
}