package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek1712 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] s1 = s.split(" ");
		long first = Integer.parseInt(s1[0]);
		long second = Integer.parseInt(s1[1]);
		long cost = Integer.parseInt(s1[2]);
		long count = 1;
		long sum = first + second * count;
		long saleCount = cost * count;
		if (second < cost) {
			while (sum >= saleCount) {
				count++;
				sum = first + second * count;
				saleCount = cost * count;
			}
			System.out.print(count);
		}
		if (second >= cost) {
			System.out.print(-1);
		}
	}
}
