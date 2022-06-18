package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek2839 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		if (input == 4 || input == 7) {
			System.out.print(-1);
		} else if (input % 5 == 0) {
			System.out.print(input / 5);
		} else if (input % 5 == 1 || input % 5 == 3) {
			System.out.print((input / 5) + 1);
		} else if (input % 5 == 2 || input % 5 == 4) {
			System.out.print((input / 5) + 2);
		}
	}
}
