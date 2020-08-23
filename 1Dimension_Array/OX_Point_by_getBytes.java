//https://www.acmicpc.net/problem/8958
//import java.util.*;
import java.io.*;
public class OX_Point_by_getBytes {//bufferedReader 안의 getByteS() 메소드를 이용해 푸는 방법이다.
									//ㄴgetBytes()는 BufferedReader로 읽어온(입력된) String을 byte단위의 배열로 반환시켜주는 메소드다.

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());//Test case
		
		for(int i=0; i<T; ++i) {//score출력 횟수: T회
			
			
			int score = 0;
			int sum =0;
			//새로운 OX스트링을 읽기 시작할 때 마다 score와 sum을 0으로 초기화해줌.
			
			for(byte val : br.readLine().getBytes()) {
				
				if(val=='O') {
					score++;
					//O가 나올때마다 score값에 1을 중첩
				} else {
					score=0;//X가 나오는 순간 score 초기화
				}
				//중첩될 때 마다 그때그때 총점수 sum에 넣어줌.
				sum+=score;
			}
			System.out.println(sum);
		}
		
	}
}