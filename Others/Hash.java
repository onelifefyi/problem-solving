import java.util.HashMap;
public class Hash{
    public static void main(String[] args){
        Scanner sObj= new Scanner(System.in);

        int n=sObj.nextInt();
        int A[]=new int[n];
        int count=0;

        for(int i=0;i<n;i++) A[i]=sObj.nextInt();

        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();

        for(int j=0; j<n; j++){
            if(hMap.containsKey(A[j])) hMap.put(A[j], hMap.get(A[j])) + 1);
            else hMap.put(A[j], 1);
        }

        // 
    }
}

