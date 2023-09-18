package lesson016;

import java.util.Stack;

public class StackOrnek2 {

	public static void main(String[] args) {
		System.out.println(polindromMu("kayak+"));
		
		
	}
	public static boolean polindromMu(String word) {
		Stack<Character> wordStack = new Stack<>();
		
		for (Character cha : word.toCharArray()) {
			wordStack.add(cha);
		}
		
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != wordStack.pop()) {
				return false;
			}
		}
		return true;       //wordStack.isEmpty();
		
		
		
	}

}
