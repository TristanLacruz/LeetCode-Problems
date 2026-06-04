/**
 * Problem: Ransom Note (#383)
 * Link: https://leetcode.com/problems/ransom-note/
 *
 * Time Complexity: O(n·m)
 * Space Complexity: O(m)
 */
import java.util.ArrayList;

public class Ransom_Note_383 {

	public static void main(String[] args) {
		String ransomNote = "aa";
		String magazine = "aab";
		boolean result = canConstruct(ransomNote, magazine);
		System.out.println(result);
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		 ArrayList<Character> magaz = new ArrayList<>();

		 for (int i = 0; i < magazine.length(); i++) {
		        magaz.add(magazine.charAt(i));
		    }
		    
		    for (int i = 0; i < ransomNote.length(); i++) {
		        char c = ransomNote.charAt(i);
		        if (!magaz.remove((Character) c)) { // If the character cannot be removed, the note cannot be constructed
		            return false;
		        }
		    }
		    
		    return true; 
	}
}
