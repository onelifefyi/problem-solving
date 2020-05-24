import java.util.Scanner;
public class D{

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int i=0; i<nos; i++){
            int toBuy = sObj.nextInt();
            int pkgs = sObj.nextInt();
            if(pkgs >= toBuy){
                System.out.println(1);
                continue;
            }
        }
    }
}