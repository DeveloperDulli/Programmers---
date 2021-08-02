
public class CarExam {

	public static void main(String[] args) {
		Car c1 = new Car();
		//생성자 오버로딩 가능
		Car c2 = new Car("소방차");
		Car c3 = new Car("구급차");
		Car c4 = new Car("구급차", 1111);
		
		System.out.println(c2.name);
		
		
		
	}

}
