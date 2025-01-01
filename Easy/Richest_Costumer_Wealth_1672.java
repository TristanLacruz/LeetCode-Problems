
public class Richest_Costumer_Wealth {

	public static void main(String[] args) {
		int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
		int maximWealth = maximumWealth(accounts);
		System.out.println(maximWealth);
	}

	public static int maximumWealth(int[][] accounts) {
		int max = 0;
		for(int i = 0; i < accounts.length; i++) {
			int count = 0;
			for(int j = 0; j < accounts[i].length; j++) {
				count += accounts[i][j];
			}
			if(max < count) {
				max = count;
			}
		}
		return max;
	}
}
