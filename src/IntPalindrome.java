
public class IntPalindrome {
	public boolean isPalindrome(long x) {
        if ( x < 0 ) x *= -1;
        if ( x == 0 ) return true;
        long z = x;
        
        long rem = 0;
        long y = 0;
        while(x > 10) {
            rem = x % 10;
            if (y == 0)
                y = rem;
            else
                y += rem;
            y *= 10;
            x = x / 10;
        }
        y += x;
        
        return z == y? true : false;
    }
	
	public static void main(String args[]) {
		IntPalindrome inp = new IntPalindrome();
		System.out.println(inp.isPalindrome(-2147447412));
	}

}
