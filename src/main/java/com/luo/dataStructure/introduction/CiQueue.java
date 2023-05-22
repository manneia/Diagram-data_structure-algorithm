package com.luo.dataStructure.introduction;

import java.util.Stack;

/**
 * @author lkx
 * @version 1.0.0
 */
public class CiQueue {
    Stack<Integer> a;
    Stack<Integer> b;

    public CiQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void appendTail(int value) {
        a.push(value);
    }

    public int deleteHead() {
        while (!a.isEmpty()) {
            b.push(a.pop());
        }
        int result = b.empty() ? -1 : b.pop();
        while (!b.isEmpty()) {
            a.push(b.pop());
        }
        return result;
    }
}
