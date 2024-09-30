package javasessions;

public class CalculateGrade {

	public static void main(String[] args) {
		int eng = 91;
		int sci = 99;
		int math = 80;
		int his = 70;
		int phygeo = 89;
		int total = eng + sci + math + his + phygeo;
		int avg = total / 5;
		System.out.println("Total :" + total);
		System.out.println("Average :" + avg);
		if (avg >= 90) {
			System.out.println("The grade is A");
		} else if (avg >= 80) {
			System.out.println("The grade is B");
		} else {
			System.out.println("The grade is S");
		}
	}
}
