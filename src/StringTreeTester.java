import java.util.Scanner;
public class StringTreeTester {
	public static void main(String[] args) {
		StringTree st = new StringTree();
		Scanner sc = new Scanner(System.in);
		String word = "";
		while (word.equals("quit") == false) {
			System.out.println("Type any word or 'quit' to quit.");
			word = sc.next();
			if (word.equals("quit") == false) {
				st.addWord(word);
				st.printTree();
			}
		}
	}
}
