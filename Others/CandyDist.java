import java.lang.Math;

class CandyDist{

    static int minCandy(int a, int b, int c){
        int maxCan = Math.min(b, c);
        int min = 0;
        int mid = 0;
        if(b + c < a){
            return min;
        }
        while(min < maxCan){
            mid = (min + maxCan)/2;
            if(mid > maxCan){

            }
            min = mid+1;
        }
        return min;
    }

    public static void main(String[] args){
        int a = 5;
        int b = 5;
        int c = 4;
        System.out.print(minCandy(a, b, c));
    }
}