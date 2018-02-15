public class Recursion2 {
	public static void main(String[] args) {
		int[] array = { 46, 22, 7, 58, 91, 55, 31, 84, 12, 78 };
		if (findMax(array) == 91) {
			System.out.println("findMax is correct!");
		}
		if (reverseStr("Hello").equals("olleH")) {
			System.out.println("reverseString is correct!");
		}
		if (charFrequency("The quick brown fox jumps over the lazy dog.", 'o') == 4) {
			System.out.println("charFrequency is correct!");
		}
	}
	
	public static int findMax(int[]array) {
		return maxArray(array, 0, array[0]);
	}
	
	/** Finds the maximum value in an array
	* @param array array of values (sorted or unsorted)
	* @param i iterator
	* @param max maximum value found so far
	* @return maximum value
	*/
	public static int maxArray(int[] array, int i, int max) {
		if (i < array.length) {
			if (array[i] > max)
				max = array[i];
			return maxArray(array, i+1, max);
		} else
			return max;
	}
	
	/** Reverses a string
	* @param s the string to reverse
	* @return the reversed string
	*/
	public static String reverseStr(String s) {
		if ((s == null) || s.length() <= 0)
			return s;
		return reverseStr(s.substring(1)) + s.charAt(0);
	}

	/** Returns the number of times c appears in the string str
	* @param str string to test
	* @param c character to find
	* @return number of times the character appeared in the string
	*/
	public static int charFrequency(String str, char c) {
		if(str.length() == 0) {
	        return 0;
	    }
	    if (str.substring(0,1).equals(Character.toString(c))) {
	        return 1 + charFrequency(str.substring(1), c);
	    }
	    return charFrequency(str.substring(1), c);
	}
}