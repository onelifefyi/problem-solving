import java.lang.Math;

class NumFactors{

    static int nFact(int num){
        int result=0;
        for(int i=1; i<= Math.sqrt(num); i++){
            if(num%i==0){
                if(num%i==i){
                    result++;
                }
                else{
                    result+=2;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(nFact(6));
    }
}