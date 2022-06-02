package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Baek2941 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<String> test = new ArrayList<>();
		test.add("c=");
		test.add("c-");
		test.add("dz=");
		test.add("d-");
		test.add("lj");
		test.add("nj");
		test.add("s=");
		test.add("z=");

		int count = 0;
		String s = br.readLine();
		for (int i = 0; i < test.size();) {
			if (s.contains(test.get(i))) {
				s = s.replaceFirst(test.get(i), "1");
				count++;
				i = 0;
			}
			if (!s.contains(test.get(i))) {
				i++;
			}
		}
		String replace = s.replace("1", "");
		String[] split1 = replace.split("");
		int stringCount = split1.length;
		if (split1[0].equals("")) {
			stringCount = 0;
		}
		bw.write(stringCount + count+"");
		bw.flush();
	}
}
