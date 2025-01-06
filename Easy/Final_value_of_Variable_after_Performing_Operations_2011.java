
public class Final_value_of_Variable_after_Performing_Operations_2011 {

	public static void main(String[] args) {
		String[] operations = {"X++","++X","--X","X--"};
		int x = finalValueAfterOperations(operations);
		System.out.println(x);
	}

	public static int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].equals("X++") || operations[i].equals("++X")) {
				x++;
			} else {
				x--;
			}
		}
		return x;
	}
}
