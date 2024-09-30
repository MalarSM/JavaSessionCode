package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.cruiseControl();
		c.laneMaintenance();
		c.stop();
		c.start();
		c.engine();
		System.out.println("-------");
		
		BMW b = new BMW();
		b.cruiseControl();
		b.laneMaintenance();
		b.stop();
		b.start();
		b.speedTracking();
		b.engine();
		b.bmwLoading();
		System.out.println(b.price);
		System.out.println("-------");
		
		Audi a = new Audi();
		a.autoBreaking();
		a.stop();
		a.start();
		a.laneMaintenance();
        
		System.out.println("-------");
		Vehicle vh = new Vehicle();
		vh.engine();
		System.out.println("-------");
		
		//Child class object can be referred by parent class reference variable : Top casting/up casting
		//can access all the overridden and inherited methods only
		//but can not access individual methods --ref type check will be failed
		Car c1 = new BMW();//IS_A_relationship
		c1.start();
		c1.stop();
		
		Car c2 = new Audi();
		c2.start();
		c2.stop();
		//Down casting:
		//Parent class object can be referred by Child class reference variable : Top casting
		//BMW b1 = (BMW) new Car();//ClassCastException
		
		//Child class object can be referred by grand parent class reference variable : Top casting/up casting
		Vehicle v2 = new BMW();
		v2.engine();
	}

}
