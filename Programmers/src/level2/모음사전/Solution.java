package level2.모음사전;

import java.util.ArrayList;

class Solution {
	char[] cha = { 'A', 'E', 'I', 'O', 'U' };

	public int solution(String word) {

		ArrayList<String> wordList = new ArrayList<String>();
		makeWords("", wordList);
		return wordList.indexOf(word);
	}

	public void makeWords(String word, ArrayList<String> wordList) {
		wordList.add(word);
		if (word.length() == 5) {
			return;
		}
		for (char c : cha) {
			makeWords(word + c, wordList);
		}

	}
}