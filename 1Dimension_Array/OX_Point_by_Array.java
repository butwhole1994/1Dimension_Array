//https://www.acmicpc.net/problem/8958
//import java.util.*;
import java.io.*;
public class OX_Point_by_Array {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());//Test case
		String[] ox = new String[T];
		//T���� OX�� �̷���� String�� Array�� �����ص� ��, 
		//���߿� �� String �迭���� Array���� �ҷ��� ����. for���� ����� �ϳ��ϳ� ����.
		//�� Array ������ ���ϴ� String�� charAt()�Լ��� ����� �ҷ�������. 
		//��Str.charAt(int)�� Str�� ���� ���� int��° char�� �о. 'O'��'X'�� �̷���� Str �ȿ��� int��° ���� O���� X���� üũ�� �뵵�� ����
		
		for(int i=0; i<T; ++i) {//�� Array�� �� OX�� ������ String�� System.in ����.
			ox[i] = br.readLine();
		}
		
		
		for(int i=0; i<T; ++i) {//ox[]�� �д� Ƚ�� + score��� Ƚ��: Tȸ
			
			int score = 0;
			int sum =0;
			//���ο� OX��Ʈ���� �б� ������ �� ���� score�� sum�� 0���� �ʱ�ȭ����.
			
			for(int j=0; j<ox[i].length(); ++j) {
				
				if(ox[i].charAt(j)=='O') {
					score++; //O�� ���ö����� score���� 1�� ��ø
				} else {
					score=0;//X�� ������ ���� score �ʱ�ȭ
				}
				sum+=score;//��ø�� �� ���� �׶��׶� ������ sum�� �־���.
			}
			System.out.println(sum);
		}
		br.close();
	}
}