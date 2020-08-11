import java.util.Scanner;
public class Driver{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter Max Size of Each Stack: ");
        int size = sObj.nextInt();
        SetOfStack sos = new SetOfStack(size);
        System.out.println(sos.setPop());
        sos.setPush(14);
        sos.setPush(61);
        System.out.println(sos.setPop());
        System.out.println(sos.setPop());
    }
}