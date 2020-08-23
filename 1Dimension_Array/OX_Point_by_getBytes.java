//https://www.acmicpc.net/problem/8958
//import java.util.*;
import java.io.*;
public class OX_Point_by_getBytes {//bufferedReader ���� getByteS() �޼ҵ带 �̿��� Ǫ�� ����̴�.
									//��getBytes()�� BufferedReader�� �о��(�Էµ�) String�� byte������ �迭�� ��ȯ�����ִ� �޼ҵ��.

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());//Test case
		
		for(int i=0; i<T; ++i) {//score��� Ƚ��: Tȸ
			
			
			int score = 0;
			int sum =0;
			//���ο� OX��Ʈ���� �б� ������ �� ���� score�� sum�� 0���� �ʱ�ȭ����.
			
			for(byte val : br.readLine().getBytes()) {
				
				if(val=='O') {
					score++;
					//O�� ���ö����� score���� 1�� ��ø
				} else {
					score=0;//X�� ������ ���� score �ʱ�ȭ
				}
				//��ø�� �� ���� �׶��׶� ������ sum�� �־���.
				sum+=score;
			}
			System.out.println(sum);
		}
		
	}
}