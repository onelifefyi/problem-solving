import  java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int n = sObj.nextInt();
            sObj.nextLine();
            int staged = 0;
            int total = 0;
            for(char ch: sObj.nextLine().toCharArray()){
                if(ch == '<'){
                    total += staged;
                    staged = 0;
                }
                else if (ch == '>') staged++;
            }
            System.out.println(n-total);
        }
    }
}
