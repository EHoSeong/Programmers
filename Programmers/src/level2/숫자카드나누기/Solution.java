package level2.숫자카드나누기;

import java.util.Arrays;

class Solution {
	public int solution(int[] arrayA, int[] arrayB) {
		int first = getGcd(arrayA);
		int second = getGcd(arrayB);
		int answer = 0;

		boolean possA = first != 1 && divide(first, arrayB);
		boolean possB = second != 1 && divide(second, arrayA);
		if (possA && possB) {
			answer = Math.max(first, second);
		} else if (possB) {
			answer = second;
		} else if (possA) {
			answer = first;
		}
		return answer;
	}

	public static int getGcd(int[] arr) {
		int start = arr[0];
		for (int i = 1; i < arr.length; i++) {
			start = gcd(start, arr[i]);
			if (start == 1)
				break;
		}
		return start;
	}

	public static int gcd(int a, int b) {
		if (a == 0)
			return b;

		return gcd(b % a, a);
	}

	public static boolean divide(int a, int[] arr) {
		return Arrays.stream(arr).allMatch(i -> i % a != 0);
	}
}