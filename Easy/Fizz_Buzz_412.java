//https://leetcode.com/problems/fizz-buzz/description/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fizz_Buzz_412 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = Integer.valueOf(scanner.nextLine());
		List<String> results = fizzBuzz(x);
		System.out.println(results);
		scanner.close();
	}
	
	public static List<String> fizzBuzz(int n) {
		ArrayList<String> list = new ArrayList<String>();
        for(int i = 1; i <= n; i++) {
        	if((i%3 == 0) && (i%5 != 0)) { //Divided only by 3
        		list.add("Fizz");
        	}else if((i%5 == 0) && (i%3 != 0)) { //Divided only by 5
        		list.add("Buzz");
        	}else if((i%5 == 0) && (i%3 == 0)) { //Divided by both 3 and 5
        		list.add("FizzBuzz");
        	}else {
        		list.add(String.valueOf(i));
        	}
        }
		return list;
    }
}
