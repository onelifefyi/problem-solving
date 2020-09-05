import java.util.Scanner;

public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int k = sObj.nextInt();
        int prex = sObj.nextInt();
        int prey = sObj.nextInt();        
        double dist = 0;
        for(int i=0; i<n-1; i++){
            int curx = sObj.nextInt();
            int cury = sObj.nextInt();
            // System.out.println("px: " + prex + " py: " + prey);
            // System.out.println("x: " + curx + " y: " + cury);
            dist += Math.sqrt(Math.abs(Math.pow(prex - curx,2) - Math.pow(prey - cury,2)));
            //System.out.println("cur dist = " + dist);
            prex = curx;
            prey = cury;
        }
        System.out.println(dist*k/50);
    }
}