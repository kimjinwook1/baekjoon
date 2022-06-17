package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek2755 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			int floor = Integer.parseInt(br.readLine());
			int room = Integer.parseInt(br.readLine());

			bw.write(getResult(floor, room) + "");
			if (i < count - 1) {
				bw.newLine();
			}
		}
		bw.flush();
	}

	private static int getResult(int floor, int room) {
		int[][] APT = new int[15][15];
		for (int j = 0; j < 15; j++) {
			APT[j][1] = 1;
			APT[0][j] = j;
		}

		for (int j = 1; j < 15; j++) {    // 1층부터 14층까지
			for (int k = 2; k < 15; k++) {    // 2호부터 14호까지
				APT[j][k] = APT[j][k - 1] + APT[j - 1][k];
			}
		}
		return APT[floor][room];
	}
}
