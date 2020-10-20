import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int n = sObj.nextInt();
            int[] input = new int[n];
            boolean iFound = false;
            int current = 0;
            for(int i=0; i<n; i++){
                input[i] = sObj.nextInt();
                if(input[i] == 1 && !iFound){
                    current = i;
                    iFound = true;
                }
            }
            while(current < n-1 && input[current+1] == 1) current++;
            int total = 0;
            for(int j=current+1; j<input.length; j++){
                if(input[j] == 1){
                    total += j - current - 1;
                    //System.out.println("totaL: " + total + " j: " + j + " current: " + current);
                    current = j;
                    while(current < n-1 && input[current+1] == 1){
                        current++;
                    }
                    j = current;
                }
            }
            System.out.println(total);
        }
    }
}
