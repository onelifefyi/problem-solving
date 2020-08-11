import java.util.Scanner;
public class RickCard{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int z=0; z<css; z++){
            int chef = sObj.nextInt(); int rick = sObj.nextInt();
            //Chef
            if(chef <= 9) chef = 1;
            else if(chef%9 > 0) chef = chef/9 + 1;
            else chef = chef/9;
            //Rick
            if(rick <= 9) rick = 1;
            else if(rick%9 > 0) rick = rick/9 + 1;
            else rick = rick/9;        

            if(rick <= chef) System.out.println("1 " + rick);
            else System.out.println("0 " + chef);
        }
    }
}