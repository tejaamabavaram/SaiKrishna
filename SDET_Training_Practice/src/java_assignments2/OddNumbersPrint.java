
package java_assignments2;

public class OddNumbersPrint {

	public static void main(String[] args) {

		OddNumbersPrint oddNum = new OddNumbersPrint();
		oddNum.printOddNumbers();

	}

	public void printOddNumbers() {
		// Print Odd Numbers
		System.out.println("Even numebrs bewtwen 79 to 189: ");
		for (int i = 79; i <= 189; i++) {
			if (i % 2 != 0) {
				System.out.print(i + "  ");
			}
		}
	}

}
