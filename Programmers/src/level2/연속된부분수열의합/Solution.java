package level2.연속된부분수열의합;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int min = Integer.MAX_VALUE;
		int start = 0;
		int end = 0;
		int answer_st = -1;
		int answer_end = -1;
		int sum = 0;
		for (int i = 0; i < sequence.length; i++) {
			end++;
			sum += sequence[i];
			if (sum < k)
				continue;
			if (sum == k) {
				min = end - start + 1;
				answer_st = start;
				answer_end = end - 1;
			} else {
				while (sum > k) {
					sum -= sequence[start++];
				}
				if (sum == k) {
					if (min > end - start + 1) {
						min = end - start + 1;
						answer_st = start;
						answer_end = end-1;
					}
				}
			}
		}
        int[] answer = new int[] {answer_st, answer_end};
        
        return answer;
    }
}