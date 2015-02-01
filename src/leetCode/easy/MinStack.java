package leetCode.easy;

import java.util.Stack;

class MinStack
{
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();
 
    
    public void push(int x)
    {
        stack.push(new Integer(x));
        
        if(minStack.isEmpty())
            minStack.push(new Integer(x));
        else if (x <= minStack.peek())
            minStack.push(new Integer(x));

    }

    public void pop()
    {
        if(!minStack.isEmpty() && stack.peek().equals(minStack.peek()))
            minStack.pop();

        stack.pop();

    }

    public int top()
    {
        return stack.peek();

    }

    public int getMin()
    {
        return minStack.peek();

    }
}
