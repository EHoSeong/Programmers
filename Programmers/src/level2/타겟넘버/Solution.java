package level2.Å¸°Ù³Ñ¹ö;

class Solution {
	static int answer = 0;

	public int solution(int[] numbers, int target) {
		find(numbers, target, 0, 0);
		return answer;
	}

	public void find(int[] numbers, int target, int sum, int index) {
		if (index == numbers.length) {
			if (sum == target) {
				answer++;
			}
			return;
		}
		find(numbers, target, sum + numbers[index], index + 1);
		find(numbers, target, sum - numbers[index], index + 1);
	}
}