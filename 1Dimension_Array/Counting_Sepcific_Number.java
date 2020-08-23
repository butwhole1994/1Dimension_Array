//https://www.acmicpc.net/problem/2577
import java.util.*;
import java.io.*;

public class Counting_Sepcific_Number {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a =Integer.parseInt(br.readLine());
		int b =Integer.parseInt(br.readLine());
		int c =Integer.parseInt(br.readLine());
		
		String abc =Integer.toString(a*b*c);
		
		for(int i=0; i<10; ++i) {
			String t = Integer.toString(i);
			StringTokenizer st = new StringTokenizer(abc, t, true);
			StringTokenizer st1 = new StringTokenizer(abc, t);
			System.out.println(st.countTokens()-st1.countTokens());
		}
	}
}
