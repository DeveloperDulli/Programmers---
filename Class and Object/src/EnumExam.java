
public class EnumExam {
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 ="boy";
		// gender타입에 변수에는 MALE,FEMALE만 가능
		// 특정값 선언 위해서는 열거형 사용
	}

}
enum Gender{
	MALE,FEMALE;
}