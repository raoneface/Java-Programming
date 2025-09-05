class stack {
    int[] stack = new int[5];
    int tos;

    // initialize top of stack
    stack() {
        tos = -1; // tos -> (Top of stack)
    }

    // Push an item into the stack
    void push(int item) {
        if (tos == 5) {
            System.out.println("Stack is full");
        } else {
            stack[++tos] = item;
        }
    }

    // Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return stack[tos--];
    }

}

public class TestStack {
    public static void main(String[] args) {
        stack mystack1 = new stack();
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        System.out.println("Stack in mystack1");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }
    }
}
