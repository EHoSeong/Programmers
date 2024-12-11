package level2.짝지어제거하기;

import java.util.Stack;

class Solution {
	public int solution(String s) {
		int answer = -1;
		Stack<Character> stack = new Stack<>();

		for (char word : s.toCharArray()) {
			if (!stack.isEmpty() && word == stack.peek()) {
				stack.pop();
			} else {
				stack.push(word);
			}
		}
		if (stack.size() > 0) {
			answer = 0;
		} else {
			answer = 1;
		}

		return answer;
	}
}