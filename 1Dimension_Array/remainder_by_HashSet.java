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

//이번 문제의 해결방법은 두 가지가 있다.
//1. HashSet 클래스의 활용. 참고 : https://coding-factory.tistory.com/554
//HashSet 클래스는 java.util.의 라이브러리 클래스다.
//중복된 값을 자동으로 제거해준다는 편리함이 있지만, 값이 많을 경우 초기용량을 지정해줘야 한다는 점. 순서가 없는 비선형구조라는 점이 있다.

//2.Array로 풀이.
//42로 나누었을 때 나머지는 0~41의 경우의 수가 있고 개수는 42개이다.
//이를 이용해 길이가 42인 boolean배열을 생성한다.

//boolean의 default값은 false라는 점을 이용해, [n%42]번째 배열에 true값을 준다.
//n%42값이 중복되는 것이 나오더라도, 결국은 true라는 boolean으로 존재하고 개수는 변화가 없기에 이제 true의 갯수만 세면 된다.

////int[]에 n%42값을 각각 담으면 중복된 값을 직접 걸러내야되지만 -> boolean[]에 [n%42번째]라는 식으로 "자리"를 지정해주면, 0~41까지의 경우의 수가 한 번씩만 등장한다는 점 + boolean은 false true 두 가지 값만 있기에 true갯수만 세면 된다는 점을 기억하자.