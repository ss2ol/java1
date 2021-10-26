
public class DatatypeCasting {

	public static void main(String[] args) {
		// 정수 변수에 실수 데이터를 삽입 -에러
		//int age = 51.7
		
		//실수 변수에 정수데이터를 입력
		//자동 형 변환 -에러 발생X
		double height = 160;
		System.out.println("키는 " + height +"cm");
		
		//강제 형 변환
		//테이터의 자료형을 변경 대입
		//실수를 정수로 변경 대입
		//소수 제거
		int age = (int)60.1;
		System.out.println("나이는 " + age + "입니다");
		
		//표현범위 밖의 숫자를 강제로 변환 대입
		//overflow or underflow 발생
		//byte :-128~127
		byte b = (byte)128;
		System.out.println(b);
		b = (byte)-129;
		System.out.println(b);
		
	}

}
