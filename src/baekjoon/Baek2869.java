package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2869 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer input = new StringTokenizer(br.readLine());
		int up = Integer.parseInt(input.nextToken());
		int down = Integer.parseInt(input.nextToken());
		int top = Integer.parseInt(input.nextToken());
		double result = (double) (top - up) / (up - down);
		System.out.print((int)(Math.ceil(result) + 1));
	}
}
