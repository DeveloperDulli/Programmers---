
public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		//���� �����ؼ� ���� �ν��Ͻ��� �ƴϴ�.
		if(str1 == str2)
			System.out.println("str1 �� str2 �� ���� ���۷����Դϴ�.");
		// ��� o ����
		if(str1 == str3)
			System.out.println("str1 �� str3 �� ���� ���۷����Դϴ�.");
		// ��� x �ٸ���
		if(str3 == str4)
			System.out.println("str3 �� str4 �� ���� ���۷����Դϴ�.");
		// ��� x �ٸ���
		
		// == �����ڴ� ������ ���۷��� ��
		// equals �޼ҵ�� ���ڿ��� ���� ������ ���

		System.out.println(str1);
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
		
		
		
	}

}
