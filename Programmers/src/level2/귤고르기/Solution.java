package level2.±Ö°í¸£±â;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
	public int solution(int k, int[] tangerine) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < tangerine.length; i++) {
			map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
		}
		Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().stream().sorted((o1, o2) -> {
			return o2.getValue() - o1.getValue();
		}).collect(Collectors.toList()).iterator();
		int answer = 0;
		int cnt = 0;
		while (cnt < k && iter.hasNext()) {
			Map.Entry<Integer, Integer> it = iter.next();
			answer++;
			cnt += it.getValue();
		}
		return answer;
	}
}