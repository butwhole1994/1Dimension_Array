//https://www.acmicpc.net/problem/2562
import java.util.*;

public class biggest_one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		int big = a[0];
		int t = 0;
		
		for(int i=0; i<9; ++i) {
			a[i] = sc.nextInt();
			if(a[i]>big) {
				big=a[i];
				t=i+1;
			}
		}
		sc.close();
		System.out.println(big);
		System.out.println(t);
	}

}
