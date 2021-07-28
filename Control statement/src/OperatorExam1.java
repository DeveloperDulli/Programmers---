
public class OperatorExam1 {

	public static void main(String[] args) {
		int b1 = (5 < 4) ? 50 : 40;
		System.out.println(b1);
		// 참이라면 앞, 거짓이라면 뒤
		
		int b2 = 0;
		if(5 > 4) {
				b2 = 50;
		}else {
				b2 = 40;
		}
		System.out.println(b2);
		
		// 삼항연산자: 조건 ? 참 : 거짓 ;
	}

}
