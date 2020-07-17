/* Problem: Three in One: Describe how you could use a single array to implement three stacks.  */

/* Approach: 
First let's think of the way a stack is implemented using array:
    > we keep a pointer tail to the last inserted element of the array
    > for insertion we increment tail and put the new value there, if tail > size of array(index) then stack overflows
    > for removing/popping we just decrement tail; if tail < 0 then stack empty

Now what would be the best way for implementing two stacks (implemented)
    > One simplest way would be to divide the array in two halfs
    > first stack's head = 0 and max tail = array.length/2 - 1;
    > second stack's head = array.length/2 and max tail = array.length - 1 (for index starting at 0)
    > In this approach there can be case where one array overflows while second one has free space

To solve the above problem, we can start the second stack from end of array in reverse direction
    > first stack's head = 0; first array max tail = secondstack.tail - 1
    > second stacks head = array.length -1 ; second stack's max tail = firststacks.tail + 1
    > to insert in second array, decrement tail then insert element

Now for the case of 3 arrays; two can be of the above form, third one starting from the middle
To improve further we can make the third array shift on the basis of size of first stack to ensure full utilization of space
This however will increase the complexity because of the need of shifthing whole 3rd stack for each insertion in first stack;
( NOT implemented here ) 
 */

class TwoStackWithArray{
    int[] arr;
    int firstHead;
    int firstTail;
    int secondHead;
    int secondTail;

    TwoStackWithArray(){
        arr = new int[10];
        firstHead = -1;
        firstTail = firstHead;
        secondHead = arr.length;
        secondTail = secondHead;
    }

    void push1(int ele){
        if(firstTail+1 == secondTail) System.out.println("StackOverflow");
        else arr[++firstTail] = ele;
    }
    int pop1(){
        if(firstTail == firstHead-1){
            System.out.println("Stack Empty");
            System.exit(-1);
        }
        return arr[firstTail--];
    }

    void push2(int ele){
        if(secondTail-1 == firstTail) System.out.println("StackOverflow");
        else arr[--secondTail] = ele;
    }    
    int pop2(){
        if(secondTail == secondHead+1){
            System.out.println("Stack Empty");
            System.exit(-1);
        }
        return arr[secondTail++];
    }

    void showAll(){
        System.out.print("start-");
        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + "-");
        System.out.println("end");
    }
} 

public class ThreeStackWithArray{
    public static void main(String[] arsg){
        TwoStackWithArray stk = new TwoStackWithArray();
        stk.push2(14);
        stk.push1(61);
        stk.push2(18);
        stk.push2(21);
        stk.push2(75);
        stk.push1(71);
        stk.push1(60);
        stk.push1(62);
        stk.push1(100);
        stk.push2(104);
        stk.push1(101);
        stk.push1(101000);
        stk.showAll();
    }
}
