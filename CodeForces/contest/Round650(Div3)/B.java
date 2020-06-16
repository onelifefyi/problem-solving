import java.util.Scanner;
public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = Integer.parseInt(sObj.nextLine());
        for(int z=0; z<nos; z++){
            //System.out.println("case: " + (z+1));
            int n = sObj.nextInt();
            int arr[] = new int[n];
            int odds = 0;
            int evens = 0;
            for(int i=0; i<n; i++){
                arr[i] = sObj.nextInt();
                if(i%2 == 0){
                    if(arr[i]%2 != 0){
                        evens++;
                    }
                }
                else{
                    if(arr[i]%2 != 1){
                        odds++;
                    }
                }
            }
            if(evens != odds){
                System.out.println(-1);
            }
            else{
                System.out.println(evens);
            }
        }
    }
}