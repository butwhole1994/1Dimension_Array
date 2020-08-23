//https://www.acmicpc.net/problem/8958
//import java.util.*;
import java.io.*;
public class OX_Point_by_Array {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());//Test case
		String[] ox = new String[T];
		//T개의 OX로 이루어진 String을 Array로 저장해둔 후, 
		//나중에 각 String 배열값을 Array별로 불러낼 거임. for문을 사용해 하나하나 전부.
		//각 Array 순서에 속하는 String을 charAt()함수를 사용해 불러낼거임. 
		//ㄴStr.charAt(int)은 Str의 글자 속의 int번째 char를 읽어냄. 'O'와'X'로 이루어진 Str 안에서 int번째 수가 O인지 X인지 체크할 용도로 쓰임
		
		for(int i=0; i<T; ++i) {//각 Array에 들어갈 OX로 구성된 String을 System.in 해줌.
			ox[i] = br.readLine();
		}
		
		
		for(int i=0; i<T; ++i) {//ox[]를 읽는 횟수 + score출력 횟수: T회
			
			int score = 0;
			int sum =0;
			//새로운 OX스트링을 읽기 시작할 때 마다 score와 sum을 0으로 초기화해줌.
			
			for(int j=0; j<ox[i].length(); ++j) {
				
				if(ox[i].charAt(j)=='O') {
					score++; //O가 나올때마다 score값에 1을 중첩
				} else {
					score=0;//X가 나오는 순간 score 초기화
				}
				sum+=score;//중첩될 때 마다 그때그때 총점수 sum에 넣어줌.
			}
			System.out.println(sum);
		}
		br.close();
	}
}