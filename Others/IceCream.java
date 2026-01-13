// problem: https://www.codechef.com/JUNE20B/problems/CHFICRM
// note: alwas empty input stream if breaking between taking input

import java.util.Scanner;

class IceCream{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int n5 = 0;
            int n10 = 0;
            int n = sObj.nextInt();
            boolean possible = true;
            for(int i=0; i<n; i++){
                int cash = sObj.nextInt();
                if(cash == 5) n5++;
                else if(cash == 10){
                    if(n5 == 0){
                        System.out.println("NO");
                        possible = false;
                        break;
                    }
                    n5--;
                    n10++;
                }
                else{
                    if(n10 == 0){
                        if(n5<2){
                            System.out.println("NO");
                            possible = false;
                            break;
                        }
                        n5 -= 2;
                    }
                    else n10--;
                }
            }
            sObj.nextLine();                            // I was forgetting this line
            if(possible) System.out.println("YES");
        }
    }
}