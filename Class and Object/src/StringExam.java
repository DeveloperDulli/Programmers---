
public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		//값이 같다해서 같은 인스턴스는 아니다.
		if(str1 == str2)
			System.out.println("str1 과 str2 는 같은 레퍼런스입니다.");
		// 출력 o 같다
		if(str1 == str3)
			System.out.println("str1 과 str3 은 같은 레퍼런스입니다.");
		// 출력 x 다르다
		if(str3 == str4)
			System.out.println("str3 과 str4 은 같은 레퍼런스입니다.");
		// 출력 x 다르다
		
		// == 연산자는 변수의 레퍼런스 비교
		// equals 메소드는 문자열이 같은 값인지 사용

		System.out.println(str1);
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
		
		
		
	}

}
