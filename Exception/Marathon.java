// Marathon max distance 42.195, print top 3 non finishers, note that they must start.
// when q is entered terminate!
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Marathon{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList<Double>();
        while(true){
            try{
                String input = sObj.nextLine();
                if(input.equals("q")) break;
                double toPut = Double.parseDouble(input);
                if(toPut >= 42.195 || toPut == 0) continue;
                else arr.add(toPut);
            }
            catch(Exception e){
                // Exception if anything other than q
                continue;
            }
        }
        Collections.sort(arr);
        int index = arr.size() - 1;
        int counter = 3;
        while(index >= 0 && counter >0){
            System.out.print(arr.remove(index--) + " ");
            counter--;
        }
    }
}