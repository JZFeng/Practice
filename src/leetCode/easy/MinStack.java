package leetCode.easy;

import java.util.Stack;
/*
 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 */
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
