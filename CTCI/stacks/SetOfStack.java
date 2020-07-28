import java.util.ArrayList;
public class SetOfStack{
    int Max;
    int length;
    int stackNo;
    ArrayList<ArrayList<Integer>> stackList;

    SetOfStack(int setMax){
        this.Max = setMax;
        this.length = 0;
        stackNo = 0;
        stackList = new ArrayList<ArrayList<Integer>>();
    }

    void add(int ele){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(ele);
        stackList.add(0, temp);
    }

    public static void main(String[] args){
        SetOfStack stack = new SetOfStack(5);
        stack.add(50);
        stack.add(50);
    }
}