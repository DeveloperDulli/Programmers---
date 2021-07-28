
public class OperatorExam {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;

		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		// 논리곱은 모두 true일 경우에만 true
		// 논리곱은 true && true = true
		// 논리곱은 true && false = false
		// 논리곱은 false && false = false
		
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		// 논리합은 하나만 true일 경우 true
		// 논리합은 true || true = true
		// 논리합은 true || false = true
		// 논리합은 false || false = false
		
		int score = 88;
		if(score <= 100 && score >=70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		// && 둘다 만족	
		
		
		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);
		// 배타적 논리합: 피연선자가 서로 다른 값일 경우 true
		// 배타적 논리합 true ^ true = false
		// 배타적 논리합 true ^ false = true
		System.out.println(!b1);
		// 논리부정 (!)

	}
	
}
