import java.util.Scanner;
public class Dub{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        StringBuilder sOut = new StringBuilder();
        boolean lastDub = false;
        char[] line = sObj.nextLine().toCharArray();
        for(int i=0; i<line.length-3; i++){
            if(line[i]=='W' && line[i+1]=='U' && line[i+2]=='B'){
                i+=2;
                sOut.append(" ");
            }
            else sOut.append(line[i]);
        }
        System.out.println(sOut);
    }
}