import java.util.Scanner;
public class Position{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int left = sObj.nextInt();

        int distance = 10;
        char next = 'R';
        int x,y;
        x = y = 0;

        while(true){
            if(left == 0) break;

            if(next == 'R'){
                x += distance;
                distance += 10;
                left--;
                next = 'U';
                continue;
            }
            if(next == 'U'){
                y += distance;
                distance += 10;
                left--;
                next = 'L';
                continue;
            }            
            if(next == 'L'){
                x -= distance;
                distance += 10;
                left--;
                next = 'D';
                continue;
            }            
            if(next == 'D'){
                y -= distance;
                distance += 10;
                left--;
                next = 'A';
                continue;
            }            
            if(next == 'A'){
                x += distance;
                distance += 10;
                left--;
                next = 'R';
                continue;
            }                                    
        }
        System.out.println(x + " " + y)       ;
    }
}