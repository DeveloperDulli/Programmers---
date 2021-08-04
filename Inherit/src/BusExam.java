
public class BusExam {

	public static void main(String[] args) {
		Car c = new Bus();
		c.run();
//		c.ppangppang();
		
		Bus bus = (Bus)c;
		//c를 Bus타입으로 형변환
		bus.run();
		bus.ppangppang();
		
		
/*		Bus bus = new Bus();
		bus.run();
		bus.ppangppang();
		
		Car car = new Car();
		car.run(); */
		
//		car.ppangppang();
		
	}

}
