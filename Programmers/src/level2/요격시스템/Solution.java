package level2.요격시스템;

import java.util.Arrays;

class Solution {
	public int solution(int[][] targets) {
		Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);

		int answer = 0;
		int shoot = 0;
		for (int i = 0; i < targets.length; i++) {
			if (shoot > targets[i][0]) {
				continue;
			} else {
				answer++;
				shoot = targets[i][1]; 
			}
		}
		return answer;
	}
}