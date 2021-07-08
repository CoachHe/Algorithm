package Section1_栈和队列.B_由两个栈实现队列;

import java.util.Stack;

public class Solution {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public Solution(){
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    //push栈向pop栈倒入数据
    private void pushToPop(){
        if (stackPop.isEmpty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }

    public void add(int pushInt) {
        stackPush.push(pushInt);
    }

    public int poll(){
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty");
        }
        pushToPop();
        return stackPop.pop();
    }

    public int peek(){
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty");
        }
        pushToPop();
        return stackPop.peek();
    }
}
