
public class LongPalSubString {

	public String longPalSubStr(String s) {
		int sLen = s.length();
		String r = "";
		for (int i = sLen - 1; i >= 0; i--) {
			r += s.charAt(i);
		}

		String res = "";
		int[][] maxLen = new int[sLen + 1][sLen + 1];
		int i = 0, j = 0;
		for (i = 1; i <= sLen; i++) {
			for (j = 1; j <= sLen; j++) {
				if (s.charAt(i - 1) == r.charAt(j - 1)) {
					maxLen[i][j] = 1 + maxLen[i - 1][j - 1];
					res += s.charAt(i - 1);
				} else
					maxLen[i][j] = Math.max(maxLen[i - 1][j], maxLen[i][j - 1]);
			}
		}

		//res = "";
		/*i--;
		j--;
		while (i > 0 && j > 0) {
			while (i > 0 && maxLen[i][j] == maxLen[i - 1][j]) {
				i--;
			}
			while (j > 0 && maxLen[i][j] == maxLen[i][j - 1]) {
				j--;
			}
			if (i > 0 && j > 0)
				res += s.charAt(i - 1);
			i--;
			j--;
		}*/

		return res;
	}

	public static void main(String[] args) {
		LongPalSubString lps = new LongPalSubString();
		System.out.println(lps.longPalSubStr(
				"anudbabd"));
	}

}
