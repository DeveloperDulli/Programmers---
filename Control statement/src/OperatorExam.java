
public class OperatorExam {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;

		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		// ������ ��� true�� ��쿡�� true
		// ������ true && true = true
		// ������ true && false = false
		// ������ false && false = false
		
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		// ������ �ϳ��� true�� ��� true
		// ������ true || true = true
		// ������ true || false = true
		// ������ false || false = false
		
		int score = 88;
		if(score <= 100 && score >=70) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		// && �Ѵ� ����	
		
		
		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);
		// ��Ÿ�� ����: �ǿ����ڰ� ���� �ٸ� ���� ��� true
		// ��Ÿ�� ���� true ^ true = false
		// ��Ÿ�� ���� true ^ false = true
		System.out.println(!b1);
		// ������ (!)

	}
	
}
