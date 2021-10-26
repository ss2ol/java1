
public class Unary {

	public static void main(String[] args) {
		int result = 10 + 20;
		System.out.println("result:" + result);
		
		String str = "10" + 20;
		System.out.println("str:" + str);
		
		result = 10 / 3;
		System.out.println("result:" + result);
		//정수 사이의 연산이므로 결과는 3
		// 1/2는 0
		//정수/정수 결과를 소수까지 구하고자 한다면 둘중 하나를 실수로 변경
		System.out.println("result:" + ((double)10/3));
		System.out.println("result:" + (10/(double)3));
		
		byte b = 30;
		byte c = 20;
		//byte d = b + c;
		// int는 byte 보다 크므로 대입 X
		byte d = (byte)(b+c);
		//int 변수에 결과를 대입하거나 결과를 byte로 변환
		
		// 숫자데이터에서 원하는 결과를 얻고자 할때 강제형 변환 이용
		

	}

}
