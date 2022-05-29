package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		char[] split = br.readLine().toCharArray();
		int sum = 0;
		for (int i = 0; i < number; i++) {
			int parseInt = Integer.parseInt(String.valueOf(split[i]));
			sum += parseInt;
		}
		System.out.println(sum);
	}
}
