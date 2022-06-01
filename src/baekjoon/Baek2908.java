package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Baek2908 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String[] s1 = s.split("");
		ArrayList<String> test = new ArrayList<>();
		for (int i = s1.length - 1; i >= 0; i--) {
			test.add(s1[i]);
		}
		StringBuilder i1 = new StringBuilder();
		StringBuilder i2 = new StringBuilder();
		for (int i = 0; i < test.size(); i++) {
			if (i < 3) {
				i1.append(test.get(i));
			}
			if (i > 3) {
				i2.append(test.get(i));
			}
		}
		int i3 = Integer.parseInt(String.valueOf(i1));
		int i4 = Integer.parseInt(String.valueOf(i2));
		bw.write(Math.max(i3, i4)+"");
		bw.flush();
	}
}
