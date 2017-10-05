
public class LongPalSubString {

	public String longPalSubStr(String s) {
		int sLen = s.length();

		String res = "";

		boolean[][] rs = new boolean[sLen][sLen];
		for (int i = 0; i < sLen; i++)
			rs[i][i] = true;

		int k = 0;
		int maxLen = -1;
		for (int d = 1; d < sLen; d++) {
			for (int i = 1; i < sLen - d; i++) {
				k = i + d;
				if (s.charAt(i) == s.charAt(k) && (rs[i+1][k-1])) {
					rs[i][k] = true;

					if(d + 1 > maxLen) {
						maxLen = d + 1;
						res = s.substring(i, k + 1);
					}
				}
			}
		}

		return res;
	}

	public static void main(String[] args) {
		LongPalSubString lps = new LongPalSubString();
		System.out.println(lps.longPalSubStr(
				"anudbabd"));
	}

}
