/* Problem: Stack Min: How would you design a stack which, in addition to push and pop, has a function min
which returns the minimum element? Push, pop and min should all operate in 0(1) time.  */

/* Approach:> My first thought was keeping an int variable to store the minimum value of stack: 
              It'll fail when the smallest element is popped;
            > Then I thought of having two variables storing the current min and the prev min:
              It's going to have the same problem, when the 2nd element gets popped (How dumb am I??)
    
    > The best approach would be to store one more value on each of the stack's node: "THE CURRENT MIN FROM SUBSTACK"
    > This way we always will know what is the minimum element of the substack and we need not to worry about what,
    will be the global minimum of stack b'cos when we reach the inner element the global min would have already been popped

    // this takes additional space O(N) and keeps push, pop and min() at O(1) time
*/

// Implementation: 

// Using array to implement stack: 
import java.util.ArrayList;

class StackMod{
    ArrayList<Integer> stack;
    ArrayList<Integer> min;
    int len;

    StackMod(){
        stack = new ArrayList<Integer>();
        min = new ArrayList<Integer>();
        len = -1;
    }

    void push(int ele){
        if(stack.size() == 0 || min.get(len) > ele) min.add(ele);
        else min.add(min.get(len));
        stack.add(ele);
        len++;
    }

    int pop(){
        min.remove(len);
        int val = stack.get(len);
        stack.remove(len);
        len--;
        return val;
    }

    int getMin(){
        return min.get(len);
    }
}

public class StackMin{
    public static void main(String[] args){
        StackMod stk = new StackMod();
        stk.push(14);
        stk.push(120);
        stk.push(12);
        System.out.println(stk.getMin());
        stk.pop();
        System.out.println(stk.getMin());
    }
}