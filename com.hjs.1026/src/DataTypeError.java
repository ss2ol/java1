
public class DataTypeError {

	public static void main(String[] args) {
		// 변수를 생성 데이터 저장 후 출력
		char ch = 'F';
		System.out.println("ch는 " + ch + "입니다.");
		
		//int ch = 'a';
		//위 문장 에러 - ch라는 변수를 생성했는데 또 생성해서
		//해결 방법 - 다른 변수를 생성
		char character = 'a';
		
		//데이터의 종류가 같다면 변수를 재사용
		ch = 'a';
		
		//ch = 91.7;
		//위 문장 에러 -변수와 대입되는 자료형이 달라서  
		//해결 - 실수 변수를 만들어서 데이터에서 해결
		//=>데이터의 손실이 없음
		double d = 91.7;
		//해결 2 char로 변경해서 대입
		//->소수는 사라짐
		ch = (char)91.7;
		
		//System.out.println(cl);
		//위 문장 에러 -cl 이라는 변수가 없어서
		//해결 - cl를 만들거나 있는 변수 이름으로 (ch)로 변경
		
		//에러는 아닌데 아무것도 출력이 되지 않는 경우
		//공백 출력 13이나 30은 enter
		
		
		
		
		

	}

}
