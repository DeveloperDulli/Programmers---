
public class Star {

	public static void main(String[] args) {
	
		
		for(int i=0; i<5; i++) { // 5줄생성
			for(int j=0; j<4-i; j++) {	// 공백 만들기
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {	// 별 찍기
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
		

