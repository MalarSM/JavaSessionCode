package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {

	public static void main(String[] args) {
		 
		int i = 9/0; //Runtime exception
		
		try {
			FileInputStream ip = new FileInputStream("test.xls");//CT
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(5000); //5 secs -- CT
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
