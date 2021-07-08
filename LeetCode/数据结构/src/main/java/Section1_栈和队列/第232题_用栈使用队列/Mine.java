package Section1_栈和队列.第232题_用栈使用队列;

import java.util.Stack;

public class Mine {
    Stack<Integer> stackPush;
    Stack<Integer> stackPop;

    public Mine(){
        this.stackPop = new Stack<Integer>();
        this.stackPush = new Stack<Integer>();
    }

    public void PushToPop() {
        while (!stackPop.empty()) {
            stackPush.push(stackPop.pop());
        }
        while (!stackPush.empty()) {
            stackPop.push(stackPush.pop());
        }
    }

    public void push(int x) {
        while (!stackPop.empty()) {
            stackPush.push(stackPop.pop());
        }
        this.stackPush.push(x);
        PushToPop();
    }

    public int pop(){
        if (stackPop == null) {
            throw new RuntimeException("Queue is null");
        }
        return stackPop.pop();
    }

    public int peek(){
        if (stackPop == null) {
            throw new RuntimeException("Queue is null");
        }
        return stackPop.peek();
    }

    public boolean empty(){
        return stackPop.empty();
    }

    public static void main(String[] args) {
        Mine queue = new Mine();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}
