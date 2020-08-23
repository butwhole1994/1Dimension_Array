//https://www.acmicpc.net/problem/10818
import java.util.*;
public class smollest_biggest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; ++i) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		sc.close();
		System.out.println(a[0]+" "+a[n-1]);

	}

}
