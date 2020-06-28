import java.util.Scanner;
public class C{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int z=0; z<nos; z++){
            int n = sObj.nextInt();
            sObj.nextLine();
            char[] arr = sObj.nextLine().toCharArray();
            int left = 0;
            int count = 0;
            for(char ch: arr){
                if(ch == ')'){
                    if(left <= 0){
                        count++;
                    }
                    else{
                        left--;
                    }
                }
                else{
                    left++;
                }
            }
            System.out.println(count);
        }
    }
}
