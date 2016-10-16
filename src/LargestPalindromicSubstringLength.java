public class LargestPalindromicSubstringLength {
	public void longestPalindrome(String s) {
		int[][] maxPal = new int[s.length()][s.length()];

		for (int i = 0; i < s.length(); i++) {
			maxPal[i][i] = 1;
		}

		int j = 0;
		for (int d = 1; d < s.length(); d++) {
			for (int i = 0; i < s.length() - d; i++) {
				j = i + d;
				if (s.charAt(i) == s.charAt(j)) {
					maxPal[i][j] = 2 + maxPal[i + 1][j - 1];
				} else {
					maxPal[i][j] = Math.max(maxPal[i + 1][j],
							maxPal[i][j - 1]);
				}
			}
		}

		System.out.println(maxPal[0][s.length() - 1]);
	}

	public static void main(String[] args) {

		LargestPalindromicSubstringLength lps = new LargestPalindromicSubstringLength();
		lps.longestPalindrome("anuragarunadadabcba");
	}

}
