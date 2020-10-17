import  java.util.Scanner;
import java.util.ArrayList;
public class C {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        sObj.nextLine();
        for(int zz=0; zz<css; zz++){
            ArrayList<Character> input = new ArrayList<Character>();
            for(char ch: sObj.nextLine().toCharArray()) input.add(ch);
            int current = 0;
            while(current < input.size()-1 && input.size() > 1){
                //System.out.println("Current: " + current);
                current = Math.max(0, current);
                if(input.get(current+1) == 'B'){
                    input.remove(current+1);
                    input.remove(current);
                    current--;
                }
                else current++;
            }
            //System.out.println(input);
            System.out.println(input.size());
        }
    }
}
