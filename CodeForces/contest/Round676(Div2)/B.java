import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            StringBuilder sOut = new StringBuilder();
            int n = sObj.nextInt();
            sObj.nextLine();
            String[] input = new String[n];
            for(int i=0; i<n; i++) input[i] = sObj.nextLine();
            int first =  input[0].charAt(1);
            int second = input[1].charAt(0);
            int beforeLast = input[n-2].charAt(n-1);
            int last = input[n-1].charAt(n-2);
            int count = 0;
            if(first + second == 96 || first + second == 98){
                //System.out.println("top clear");
                if(beforeLast == first){
                    sOut.append("\n" + (n-1) + " " + (n));
                    count++;
                }
                if(last == first){
                    sOut.append("\n" + (n) + " " + (n-1));
                    count++;
                }
            }
            else if(beforeLast + last == 96 || first + second == 98){
                //System.out.println("bottom clear");
                if(first == last){
                    sOut.append("\n1 2");
                    count++;
                }
                if(second == last){
                    sOut.append("\n2 1");
                    count++;
                }
            }
            else{
                count = 2;
                sOut.append("\n" + (n) + " " + (n-1));
                if(first == last) sOut.append("\n1 2");
                else sOut.append("\n2 1");
            }
            if(count == 0) System.out.println(0);
            else System.out.println(count + "" + sOut);
        }        
    }
}
