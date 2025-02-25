public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean isPalindrome(String word) {
		char[] letters = word.toLowerCase().replaceAll(" ", "").toCharArray();
		int check = 0;
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == letters[letters.length - i - 1]) {
				check++;
			}
		} 	if (check == letters.length) {
			return true;
	}
		return false;
		

	}
	public static int getAge(String[] names, int[] ages, String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				return ages[i];
				}
			} return -1;
		}
	
	public static int countWords(String s, char c) {
		String[] phrase = s.split(" "); 
		int count = 0;
		for (int i = 0; i < phrase.length; i++) {
			if (phrase[i].contains("" + c)) {
				count++;
			}
		}
		return count;


	}
	
}

