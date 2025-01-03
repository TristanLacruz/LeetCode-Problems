package easy;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_118 {

	public static void main(String[] args) {
		List<List<Integer>> list = generate(5);
		System.out.println(list);
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> mainList = new ArrayList<>();
		
		ArrayList<Integer> firstRow = new ArrayList<>();
	    firstRow.add(1);
	    mainList.add(firstRow);
		
	    for (int i = 1; i < numRows; i++) {
	        ArrayList<Integer> newRow = new ArrayList<>();
	        List<Integer> prevRow = mainList.get(i - 1); //take previous list

	        newRow.add(1); //first number is always 1

	        for (int j = 1; j < i; j++) {
	            newRow.add(prevRow.get(j - 1) + prevRow.get(j)); 
	        }

	        newRow.add(1); //last number is always 1

	        mainList.add(newRow);
	    }
	    return mainList;
	}
}
