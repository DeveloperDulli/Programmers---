
public class WhileExam {

	public static void main(String[] args) {
/*		int i = 0;
		
		while(i <10) {
			System.out.println(i);
			i++; // i=i+1;
// while문 = 반복문
// 실행문을 반복적으로 실행해야 할 때 사용
		}  */

		int total = 0;
		int i = 1;
		
		while(i <= 100) {
			total = total + i;
			i++;
			System.out.println(total);
			
			while(true) {
				System.out.println("hello");
			}
			
		}
		
	}

}
