import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// br.skip(1);
		for (int i = 1; i <= N; i++) {
			int sum = 0;
			boolean eligibility = false;
			int T = Integer.parseInt(br.readLine());
			// System.out.println(T);
			// int a[] = new int[T];
			String line = br.readLine(); // to read multiple integers line
			// System.out.println(line);
			String[] strs = line.trim().split("\\s+");
			for (int j = 0; j < T; j++) {
				int num = Integer.parseInt(strs[j]);
				if (num > 2) {
					if (num == 5)
						eligibility = true;
					sum += num;
				} else {
					eligibility = false;
					// sc.nextLine();
					break;
				}

			}
			if ((sum / T >= 4) && eligibility)
				System.out.println("Yes");
			else
				System.out.println("No");

		}
		br.close();
	}

}
