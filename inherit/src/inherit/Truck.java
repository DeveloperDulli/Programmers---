package inherit;

public class Truck extends Car {
	public Truck() {
		super("소방차");
		//super 키워드: 부모 객체를 나타냄
		System.out.println("Truck의 기본 생성자 입니다.");
	}

}
