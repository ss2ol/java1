
public class Logical {

	public static void main(String[] args) {
		System.out.println(10>3);
		
		int year = 2021;
		//윤년인지 판별
		//4의 배수이고 100의 배수가 아니면 윤년
		//또는 400의 배수
	
		boolean pan = year % 4 == 0 && year %100 != 0 || year % 400 == 0;
				System.out.println(pan);
				
				
	
		

	}

}
