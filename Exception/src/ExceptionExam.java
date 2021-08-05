
public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 5;
		try {
		int k = i/j;
		System.out.println(k);
		
		}catch(ArithmeticException e) {
		System.out.println("0으로 나눌 수 없습니다."+e.toString());
		
		}finally {
		System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행!!");
			}
		
		System.out.println("main end!!");
		

	}

}
// 1. 오류가 발생할 예상 부분을 try라는 블록으로 감싸기
// 2. 발생할 오류와 관련된 Exception을 catch라는 블록에서 처리
// 3. 오류가 발생했든 안했든 무조건 실행되는 finally라는 블록을 가질 수 있다.
// 4. finally 블록은 생략 가능