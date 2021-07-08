package Section1_栈和队列.F_用栈来解汉诺塔问题;

import java.util.Stack;

public class Mine_Advanced {
    public enum Action{
        No, LTM, MTL, MTR, RTM
    }

    public static int hanoiProblem2(int num, String l, String m, String r) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> mid = new Stack<>();
        Stack<Integer> right = new Stack<>();
        left.push(Integer.MAX_VALUE);
        mid.push(Integer.MAX_VALUE);
        right.push(Integer.MAX_VALUE);
        for (int i = num; i > 0; i--) {
            left.push(i);
        }
        Action[] record = {Action.No};
        int step = 0;
        while (right.size() != num + 1) {
            step += fStackToStack(record, Action.MTL, Action.LTM, left, mid, l, m);
            step += fStackToStack(record, Action.LTM, Action.LTM, mid, left, m, l);
            step += fStackToStack(record, Action.RTM, Action.LTM, mid, right, m, r);
            step += fStackToStack(record, Action.MTR, Action.LTM, right, mid, r, m);
        }
        return step;
    }

    public static int fStackToStack(Action[] record, Action preNoAct, Action nowAct, Stack<Integer> fStack,
                                    Stack<Integer> tStack, String from, String to) {
        if (record[0] != preNoAct && fStack.peek() < tStack.peek()) {
            tStack.push(fStack.pop());
            System.out.println("Move " + tStack.peek() + " from " + from + " to " + to);
            record[0] = nowAct;
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(hanoiProblem2(3, "left", "mid", "right"));
    }
}
