import java.util.Arrays;

class PrimeSieve{

    static void findPrime(int num){
        Boolean[] bArr = new Boolean[num+1];
        Arrays.fill(bArr, true);
        for(int i=2; i*i<=num; i++){
//            System.out.println(i);
            for(int j=1; j<=num; j++){
                if(j%i==0){
                    bArr[j] = false;
                }
            }
        }
        for(int x=1; x<=num; x++){
            if(bArr[x]){
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
        findPrime(61);
    }
}