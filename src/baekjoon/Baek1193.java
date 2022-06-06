package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek1193 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int n = 0;
		int count = 0;
		n += count + 1;
		count++;
		while (n < input) {
			n += count + 1;
			count++;
		}

		int result;
		int sum;
		int result2;
		if (count % 2 == 1) {
			result = input + count - n; //분모
			sum = count + 1;
			result2 = sum - result;//분모
			System.out.println(result2 + "/" + result);
		}
		if (count % 2 == 0) {
			result = input + count - n; //분자
			sum = count + 1;
			result2 = sum - result; //분모
			System.out.println(result + "/" + result2);
		}
	}
}
