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
        if(top == -1) return Integer.MAX_VALUE;
        return stk.remove(top--);
    }

    int getSize(){
        return top+1;
    }

    int peek(){
        if(top == -1) return Integer.MAX_VALUE;
        return stk.get(top);
    }

    void showAll(){
        System.out.print("Bottom->");
        for(int ele: stk){
            System.out.print(ele + " ");
        }
        System.out.println("\b<-Top");
    }
}