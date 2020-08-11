// problem:  Implement a MyQueue class which implements a queue using two stacks. 

public class QwithStack{
    Stack stk;
    Stack tmpStk;
    int total;

    QwithStack(){
        total = 0;
        stk = new Stack();
        tmpStk = new Stack();
    }

    void enQ(int n){
        total++;
        stk.push(n);
    }

    int deQ(){
        for(int i=0; i<total; i++) tmpStk.push(stk.pop());
        int result = tmpStk.pop();
        total--;
        for(int j=0; j<total; j++) stk.push(tmpStk.pop());
        return result;
    }

    public static void main(String[] args){
        QwithStack qstk = new QwithStack();
        qstk.enQ(14);
        qstk.enQ(75);
        qstk.enQ(61);
        System.out.println(qstk.deQ());
        System.out.println(qstk.deQ());
    }
}