package lesson015;

import java.util.Stack;

public class StackOrnek1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(2);
		stack.push(44);
		stack.push(5);
		stack.push(4);
		stack.push(9);
		
		System.out.println(stack);
		
		stack.remove(3);
		
		System.out.println(stack);
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		System.out.println(stack);
	}

}
