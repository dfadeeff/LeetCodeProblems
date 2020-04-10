import java.util.Stack;

public class MinStack {

	private Stack<StackPair> stack;

	public MinStack() {
		stack = new Stack<>();
	}

	public void push(int x) {
		if (stack.isEmpty()) {
			stack.push(new StackPair(x, x));
		} else {
			int currMin = stack.peek().currMin;
			stack.push(new StackPair(x, Math.min(x, currMin)));
		}
	}

	public void pop() {
		if (!stack.isEmpty()) {
			stack.pop();
		}
	}

	public int top() {
		return stack.peek().val;
	}

	public int getMin() {
		return stack.peek().currMin;
	}

	class StackPair {
		private int val;
		private int currMin;

		StackPair(int val, int currMin) {
			this.val = val;
			this.currMin = currMin;
		}
	}

	public static void main(String[] args) {
		MinStack obj = new MinStack();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		obj.getMin();
		obj.pop();
		obj.top();
		obj.getMin();

	}

}
