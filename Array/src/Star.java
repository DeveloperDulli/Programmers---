
public class Star {

	public static void main(String[] args) {
	
		
		for(int i=0; i<5; i++) { // 5�ٻ���
			for(int j=0; j<4-i; j++) {	// ���� �����
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {	// �� ���
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
		

