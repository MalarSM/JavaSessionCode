package constructorConcept;

public class Rectangle {
	
	double length;
	double width;
	
	public Rectangle() {
		
	}
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	


	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle();
		Rectangle rec = new Rectangle(5.00 , 2.00);
		System.out.println(rec1.length);
		System.out.println(rec1.width);
		System.out.println(rec.length);
		System.out.println(rec.width);
		
		double area = (rec.length * rec.width);
		System.out.println("area of rectangle is :" + area);
		
		
		
	}

}
