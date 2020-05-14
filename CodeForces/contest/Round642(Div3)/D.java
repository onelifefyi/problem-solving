import java.util.Scanner;

public class D{

    public static boolean getStatus(int[] arr){
        for(int ele: arr){
            if(ele == 0){
                return false;
            }
        }
        return true;
    }

    public static int getmax(int[] arr){
        int count = 0;
        int max = 0;
        for(int ele: arr){
            //System.out.println("count :"+ count);
            if(ele == 0){
                count++;
            }
            else{
                count = 0;
            }
            if(count > max){
                max = count;
            }
        }
        //System.out.println("max" + max);
        return max;
    }

    public static int[] getindex(int[] arr){
        int[] seq = new int[2];
        int max = getmax(arr);
        boolean flag = true;
        seq[0] = 1;
        seq[1] = arr.length;
        for(int x=0; x<arr.length - max; x++){
            //System.out.println("x is :" + x);
            if(flag == false){
                seq[0] = x + 1;
                seq[1] = x+max;
            }
            flag = true;
            for(int y=0; y<max; y++){
                if(arr[y] != 0){
                    //System.out.println("Stopped At: " + x + "," + y);
                    flag = false;
                    break;
                }
            }
            if(flag){
                seq[0] = x+1;
                seq[1] = x+max;
                return seq;
            }
        }
        return seq;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        
        /*for(int ele: seq){
            System.out.print(" ele: " + ele);
        }
        */
        int cases = sObj.nextInt();
        for(int i=0; i<cases; i++){
            int size = sObj.nextInt();
            int[] arr = new int[size];
            for(int zz=0; zz<size; zz++){
                arr[zz] = 0;
            }
            int count = 1;
            System.out.println("getstatus :" + getStatus(arr));
            while(!getStatus(arr)){
                int seq[] = new int[2];
                seq = getindex(arr);
                System.out.println("s0: " +seq[0] +" s1: " + seq[1]);
                if((seq[0] + seq[1])%2!=0){
                    arr[(seq[0] + seq[1])/2 - 1] = count;
                    count++;
                }
                else{
                    //System.out.println("seq[0]: " + seq[0] +" seq[1]: " + seq[1]);
                    arr[(seq[0] + seq[1] - 1)/2 - 1] = count;
                    count++;
                }
                
                for(int ele: arr){
                    System.out.println(ele + " ");
                }
            }
            //System.out.println();
        }

    }
}