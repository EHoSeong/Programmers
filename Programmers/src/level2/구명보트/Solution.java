package level2.구명보트;

import java.util.Arrays;

class Solution {
	static int answer = 0;

	public int solution(int[] people, int limit) {
		Arrays.sort(people);
		countBoat(people, limit);
		return answer;
	}

	public static void countBoat(int[] people, int limit) {
		int index = 0;
		for (int i = people.length - 1; i >= index; i--) {
			if (people[i] + people[index] <= limit) {
				index++;
			}
			answer++;
		}
	}
}