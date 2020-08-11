import java.util.ArrayList;
public class Stack{
    int top;
    ArrayList<Integer> stk;

    Stack(){
        stk = new ArrayList<Integer>();
        top = -1;
    }

    void push(int n){
        stk.add(++top, n);
    }

    int pop(){
        return stk.remove(top--);
    }
}