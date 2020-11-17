import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int n = sObj.nextInt();
            int zeroCost = sObj.nextInt();
            int oneCost = sObj.nextInt();
            int changeCost = sObj.nextInt();

            int zeroCount, oneCount;
            zeroCount = oneCount = 0;

            sObj.nextLine();
            for(char ch: sObj.nextLine().toCharArray()){
                if(ch == '1') oneCount++;
                else zeroCount++;
            }
            int zeroToOne = changeCost + (oneCost-zeroCost);
            int oneToZero = changeCost + (zeroCost-oneCost);

            // System.out.println("zeroToOne change: " + zeroToOne);
            // System.out.println("OneToZero change: " + oneToZero);
            // System.out.println("1Cost: " + oneCost);
            // System.out.println(zeroCount*zeroCost + oneCount*oneCost);
            
            if(zeroToOne < oneToZero) System.out.println(Math.min((zeroCount*zeroCost + oneCount*oneCost), (zeroCount*changeCost + n*oneCost)));
            else System.out.println(Math.min((zeroCount*zeroCost + oneCount*oneCost), (oneCount*changeCost + n*zeroCost)));
        }
    }
}