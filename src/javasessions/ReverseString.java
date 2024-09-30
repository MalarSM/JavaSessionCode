package javasessions;

public class ReverseString {

	public static void main(String[] args) {
		String word = "SAM";
		String word2 = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			// System.out.println(word.charAt(i));
			word2 = word2 + word.charAt(i);
		}
		System.out.println(word2);
		if (word.equals(word2)) {
			System.out.println("The string is palindrome");
		} else {
			System.out.println("The string is not palindrome");
		}
	}
}
