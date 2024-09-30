package AccessModifier1;

public class BMW extends Car {
	@Override
	public void billing() {
		System.out.println("billing Car..");
	}


	public static void main(String[] args) {


		BMW b = new BMW();
	
	}

}
