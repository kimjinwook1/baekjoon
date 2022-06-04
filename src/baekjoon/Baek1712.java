package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1712 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer input = new StringTokenizer(br.readLine());
		long fixCost = Integer.parseInt(input.nextToken());
		long varCost = Integer.parseInt(input.nextToken());
		long saleCost = Integer.parseInt(input.nextToken());
		long margin = saleCost - varCost;
		if (varCost >= saleCost) {
			System.out.println(-1);
			return;
		}
		System.out.println(fixCost/margin + 1);
	}
}
