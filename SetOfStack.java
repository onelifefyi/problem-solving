/*Problem:  Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be
composed of several stacks and should create a new stack once the previous one exceeds capacity.
SetOfStacks. push () and SetOfStacks. pop () should behave identically to a single stack
(that is, pop ( ) should return the same values as it would if there were just a single stack).*/



// import java.util.ArrayList;
// public class SetOfStack{
//     int Max;
//     int length;
//     int stackNo;
//     ArrayList<ArrayList<Integer>> stackList;

//     SetOfStack(int setMax){
//         this.Max = setMax;
//         this.length = 0;
//         stackNo = 0;
//         stackList = new ArrayList<ArrayList<Integer>>();
//     }

//     void add(int ele){
//         ArrayList<Integer> temp = new ArrayList<Integer>();
//         temp.add(ele);
//         stackList.add(0, temp);
//     }

//     public static void main(String[] args){
//         SetOfStack stack = new SetOfStack(5);
//         stack.add(50);
//         stack.add(50);
//     }
// }


//Implementation
import java.util.ArrayList;
import java.util.Scanner;

public class SetOfStack{
    ArrayList<Stack> soStack;
    int currentPosition;
    int maxCap;

    SetOfStack(int max){
        soStack  = new ArrayList<Stack>();
        maxCap = max;
        currentPosition = -1;
    }

    //push
    void setPush(int ele){
        currentPosition++;
        if(currentPosition%maxCap == 0) soStack.add(currentPosition/maxCap, new Stack(maxCap));
        soStack.get(currentPosition/maxCap).push(ele);
    }

    //pop
    int setPop(){
        if(currentPosition == -1){
            System.out.println("Stack Empty, returning -1");
            return -1;
        }
        else return soStack.get(currentPosition--/maxCap).pop();
    }
}

class Stack{
    int stk[];
    int top;
    int size;

    Stack(int size){
        stk = new int[size];
        top = -1;
        this.size = size;
    }

    //push
    public boolean push(int n){
        if(top < size){
            top++;
            stk[top] = n;
            return true;
        }
        else return false;
    }

    public int pop(){
        if(top < 0){
            System.out.println("Stack Empty, returning -1");
            return -1;
        }
        else{
            return stk[top--];
        }
    }
}