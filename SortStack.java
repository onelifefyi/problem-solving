// CTCI/STACK-QUEUE Problem: Sort a stack without using any other non-primitive data-structure other than stack.

/* Approach: We can take two other stacks and taking first pop() as pivot, we can put greater element on one and smaller on other,
           this won't work b'cos there may be anomalies where smaller-greater-smallest won't work
    
    One other way would be to take two stacks tempSTK and storeSTK, keep popping the main stack and pushing to storeSTK,
    + unless it's greater than storeSTK's top, in that case push everything smaller than stks.peek() to tempSTK,
    + finally push stk.pop() to storeSTK() and then push everything from tempSTK to storeSTK. This works

    (The explaination is a bit (a lott) confusing)

    One other way to optimise it is remove tempStack, instead of it take an int variable to store stk.pop() and finally push all 
    the elements which were to be put on tempSTK to main stk() and repeat till main stk() is empty; (AGAIN confusing!!)
*/

class SortStack{
    static Stack sort(Stack stk){
        int temp = 0;
        Stack tempStk = new Stack();
        while(stk.getSize() > 0){
            temp = stk.pop();
            if(tempStk.getSize() == 0 || tempStk.peek() >= temp) tempStk.push(temp);
            else{
                while(tempStk.getSize() != 0){
                    if(tempStk.peek() >= temp) break;
                    stk.push(tempStk.pop());
                }
                tempStk.push(temp);
            }
        }
        return tempStk;
    }

    public static void main(String[] args){
        Stack stk = new Stack();
        stk.push(14);
        stk.push(3);
        stk.push(75);
        stk.push(61);
        stk.push(64);
        System.out.println("\nBefore Sorting: ");
        stk.showAll();
        stk = sort(stk);
        System.out.println("\nAfter Sorting: ");
        stk.showAll();
    }
}