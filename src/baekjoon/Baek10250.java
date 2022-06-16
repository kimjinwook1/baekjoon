package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek10250 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//첫번째 입력: 테스트 수
		//두번째 입력: 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님
		int count = Integer.parseInt(br.readLine());
		for (int i = 0; i < count; i++) {
			StringTokenizer input = new StringTokenizer(br.readLine());
			int floor = Integer.parseInt(input.nextToken());
			input.nextToken();
			int guest = Integer.parseInt(input.nextToken());
			int providedFloor = guest % floor;
			int providedRoom = guest / floor + 1;
			if (providedFloor == 0) {
				providedRoom = guest / floor;
				providedFloor = floor;
			}
			bw.write(providedFloor * 100 + providedRoom + "");
			if (i < count - 1) {
				bw.newLine();
			}
		}
		bw.flush();
	}
}
