import java.util.Scanner;
public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int z=0; z<nos; z++){
            int two = 0;
            int n = sObj.nextInt();
            int moves = 0;
            if(n == 1){
                System.out.println(0);
                continue;
            }
            while(true){
                if(n%6==0){
                    n = n/6;
                    moves++;
                }
                else{
                    n *= 2;
                    two++;
                    moves++;
                }
                if(n == 1){
                    System.out.println(moves);
                    break;
                }
                else if(two > 48){
                    System.out.println(-1);
                    break;
                }
                else if(n == 2 || n == 4 || n ==5){
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}