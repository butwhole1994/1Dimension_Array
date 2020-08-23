//https://www.acmicpc.net/problem/1546
import java.util.*;
public class Editing_Average_Point {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int test = sc.nextInt();
		double[] score = new double[test];
		double Max = score[0];
		double sum = 0;
		
		for(int i=0; i<test; ++i) {
			score[i] = sc.nextInt();
			if(score[i]>Max) {
				Max =score[i];
			}
		}
		for(int i=0; i<test; ++i) {
			score[i]=(score[i]*100/Max);
			sum += score[i];
		}
		System.out.println(sum/test);
		sc.close();
	}

}
