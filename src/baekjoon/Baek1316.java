package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek1316 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		int result = 0;
		boolean check = false;
		for (int i = 0; i < count; i++) {
			String s = br.readLine();
			String[] word = s.split("");
			for (int j = 0; j < word.length; j++) {
				for (int k = j + 2; k < word.length; k++) {
					if (word[j].equals(word[k]) && !word[j].equals(word[j + 1])) {
						check = true;
						result++;
						break;
					}
				}
				if (check) {
					break;
				}
			}
			check = false;
		}
		bw.write(count - result + "");
		bw.flush();
	}
}
