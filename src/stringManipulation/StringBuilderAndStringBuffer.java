package stringManipulation;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
		//StringBuilder: added in 1.4 //parallel execution -- fast performance
		StringBuilder sb = new StringBuilder("seleinum");//1 object will be created in memory
		sb.append("automation");
		System.out.println(sb);
		
		//StringBuffer: since 1.0 : Thread-safe //sequential execution -- slow performance
		
		String st ="seleinum";
		//System.out.println(st.rever);
        
		StringBuilder sb1 = new StringBuilder(st);
		System.out.println(sb1.reverse());
		System.out.println(st);
	}

}
