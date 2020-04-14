//Problem taken from Algorithms course (Coursera/Princeton)
import java.util.Scanner;
class TrippleSum{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        int counter = 0;
        String[] arr = sObj.nextLine().split(" ");
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(Integer.parseInt(arr[i]) + Integer.parseInt(arr[j]) + Integer.parseInt(arr[k]) == 0){
                        counter++;
                        System.out.printf("%d: %s %s %s\n",counter, arr[i], arr[j], arr[k]);
                    }
                }
            }      
        }
    }
}