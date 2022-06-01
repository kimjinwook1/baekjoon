package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek1152 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine().trim();
		String[] s1 = s.split(" ");
		if (s.equals("")) {
			bw.write(0+"");
		}
		if (!s.equals("")) {
			bw.write(s1.length+"");
		}
		bw.flush();
	}
}
