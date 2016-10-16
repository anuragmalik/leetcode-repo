/**
 * Created by anurag on 10/16/16.
 */
public class ReverseWord {
	public String reverseWords(String s) {
		return helper(s);
	}

	public String helper(String str) {

		StringBuffer sbuf = new StringBuffer();
		StringBuffer res = new StringBuffer();
		for (char ch : str.trim().toCharArray()) {
			if (ch == ' ') {
				res.append(" "+sbuf.reverse().toString());
				sbuf.delete(0, sbuf.length());
			} else
				sbuf.append(ch);
		}
		res.append(" "+sbuf.reverse().toString());
		return res.toString();
	}

	public static void main(String args[]) {
		System.out.println(new ReverseWord().reverseWords("Hey It seem to be working"));
	}
}

