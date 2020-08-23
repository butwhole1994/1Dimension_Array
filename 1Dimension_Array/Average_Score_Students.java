import java.util.*;
import java.io.*;

public class Average_Score_Students {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		double average = 0;
		double sum = 0;
		double cnt = 0;
		
		for(int i=0; i<T; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int students = Integer.parseInt(st.nextToken());
			double[] score = new double[students];
			for(int j=0; j<students; ++j) {
				score[j] = Double.parseDouble(st.nextToken());
				sum += score[j];
			}
			average = sum/students;
			for(int k=0; k<students; ++k) {
				if(score[k]>average) {
					cnt++;//double �̶� ++�� ���ָ� 1.0 �� �����ٴ� �� �˾Ҵ�.
					}
				}
			
			double percentage = cnt/students*100;
			String value = String.format("%.3f", percentage);
			//String.format("%.?f", objects)
			//��Ʈ�� ������ �����ϱ� ���ؼ�, �����͸� �Բ� �����ؾ߸� �Ѵ�.
			//���� : https://micropai.tistory.com/48
			
			//�� �� �Ҽ��� ǥ�ÿ� ���� ��� ���� : https://coding-factory.tistory.com/250
			sb.append(value+"%").append("\n");
			average = 0;
			sum=0;
			cnt=0;
		}
		System.out.println(sb);
		br.close();
	}

}

