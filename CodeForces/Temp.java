public class Temp{

    static int sample(){
        return (true?null:0);
    }

    public static void main(String[] args){
        //int arr[5] = {1,2,3};
        Temp.sample();
        System.out.println("Here");
        System.out.println(Temp.sample());
    }
}