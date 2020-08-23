//https://www.acmicpc.net/problem/3052
import java.io.*;
import java.util.*;
public class remainder_by_HashSet {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> remainder = new HashSet<Integer>();
		
		
		for(int i=0; i<10; ++i) {
			int n = Integer.parseInt(br.readLine());
			remainder.add(n%42);
		}
		System.out.println(remainder.size());
		br.close();
	}
}

//�̹� ������ �ذ����� �� ������ �ִ�.
//1. HashSet Ŭ������ Ȱ��. ���� : https://coding-factory.tistory.com/554
//HashSet Ŭ������ java.util.�� ���̺귯�� Ŭ������.
//�ߺ��� ���� �ڵ����� �������شٴ� ������ ������, ���� ���� ��� �ʱ�뷮�� ��������� �Ѵٴ� ��. ������ ���� ����������� ���� �ִ�.

//2.Array�� Ǯ��.
//42�� �������� �� �������� 0~41�� ����� ���� �ְ� ������ 42���̴�.
//�̸� �̿��� ���̰� 42�� boolean�迭�� �����Ѵ�.

//boolean�� default���� false��� ���� �̿���, [n%42]��° �迭�� true���� �ش�.
//n%42���� �ߺ��Ǵ� ���� ��������, �ᱹ�� true��� boolean���� �����ϰ� ������ ��ȭ�� ���⿡ ���� true�� ������ ���� �ȴ�.

////int[]�� n%42���� ���� ������ �ߺ��� ���� ���� �ɷ����ߵ����� -> boolean[]�� [n%42��°]��� ������ "�ڸ�"�� �������ָ�, 0~41������ ����� ���� �� ������ �����Ѵٴ� �� + boolean�� false true �� ���� ���� �ֱ⿡ true������ ���� �ȴٴ� ���� �������.