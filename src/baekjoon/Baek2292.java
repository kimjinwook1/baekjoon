package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek2292 {
//		1->6->12->18->24
//	1->2->8->20->38->62->92
//	1->7->19->37

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(br.readLine());
		int count = 1;
		int hexagon = 2;
		if (input == 1) {
			System.out.println(1);
			return;
		}
		while (input >= hexagon) {
			hexagon = hexagon + (6 * count);
			count++;
		}
		System.out.print(count);
	}
}
