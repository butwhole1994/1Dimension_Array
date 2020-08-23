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
					cnt++;//double 이라도 ++를 해주면 1.0 씩 오른다는 걸 알았다.
					}
				}
			
			double percentage = cnt/students*100;
			String value = String.format("%.3f", percentage);
			//String.format("%.?f", objects)
			//스트링 포맷을 이해하기 위해선, 포맷터를 함께 이해해야만 한다.
			//참고 : https://micropai.tistory.com/48
			
			//그 외 소수점 표시에 관한 방법 참고 : https://coding-factory.tistory.com/250
			sb.append(value+"%").append("\n");
			average = 0;
			sum=0;
			cnt=0;
		}
		System.out.println(sb);
		br.close();
	}

}

