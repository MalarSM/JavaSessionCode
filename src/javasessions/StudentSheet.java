package javasessions;

public class StudentSheet {
	
	//WAF: getStudentMarks(String name)
	//return : marks(int)
	//0 to 100
	
	public int getStudentsMarks(String name) {
		System.out.println("Student name: " + name);
		
		switch(name.toLowerCase().trim()) {
		case "priya":
			return 90;
		case "ravi":
			return 10;
		case "sasi":
			return 100;
		default:
			System.out.println("pls pass the right student name :" + name);
			return -1;
		}
	}

	public static void main(String[] args) {
		StudentSheet sh = new StudentSheet();
		int m = sh.getStudentsMarks("malar");
		System.out.println(m);
		if(m>0) {
			System.out.println("print marksheet");
		}
		

	}

}
