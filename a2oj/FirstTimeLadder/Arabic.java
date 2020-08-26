//problem: https://a2oj.com/p?ID=24
import java.util.Scanner;

class Arabic{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            StringBuilder sOut = new StringBuilder();
            int size = sObj.nextInt();
            sObj.nextLine();
            String input = sObj.nextLine();
            String[] arr = input.split(" ");
            boolean hasEng = false;
            boolean hasAra = false;
            for(String str: arr){
                if(str.charAt(0) == '#') hasAra = true;
                else hasEng = true;
            }
            if(hasAra && hasEng){
                for(int i=size-1; size >=0; i--){
                    if(arr[i].charAt(0) != '#'){
                        sOut.append(arr[i]);
                        sOut.append(" ");
                        break;
                    }
                    else{
                        sOut.append(arr[i]);
                        sOut.append(" ");
                    }
                }
                for(int j=0; j<size; j++){
                    if(arr[j].charAt(0) != '#') break;
                    else{
                        sOut.append(arr[j]);
                        sOut.append(" ");                        
                    }
                }
                System.out.println(sOut.toString().trim());
            }
            else System.out.println(input.trim());
        }
    }
}