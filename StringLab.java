import java.util.Scanner;

/* 
 * 
 * @author >>Rana.Siroosian<<
 */

public class StringLab {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		
		System.out.println("Please enter a word: ");
		String word = scnr.nextLine();
		System.out.println(capitalize(word));
		
		System.out.println();

		System.out.println("Please enter a sentence that contains word 'waldo': ");
		String phrase = scnr.nextLine();	
		System.out.println("waldo's location is: " + wheresWaldo(phrase));

		
		System.out.println();
		
		System.out.println("Please enter the first word: ");
		String a = scnr.nextLine();
		System.out.println("Please enter the second word: ");
		String b = scnr.nextLine();
		System.out.println(firstThingsFirst(a,b));
		
		System.out.println();

		System.out.println("Please enter a word: ");
		String s = scnr.nextLine();
		System.out.println(reverse (s));
		
		System.out.println();
		
		System.out.println("Please enter the first word: ");
		String a1 = scnr.nextLine();
		System.out.println("Please enter the second word: ");
		String b1 = scnr.nextLine();
		soLong(a1,b1);
		
		System.out.println();
		
		System.out.println("Please enter a sentence that contains word 'Math' or 'math': ");
		String phrase1 = scnr.nextLine();
		System.out.println(afterMath(phrase1));
		
		System.out.println();
		
		System.out.println("Please enter a word: ");
		String word1 = scnr.nextLine();
		letterize(word1);
		
		System.out.println();
		
		System.out.println("Please enter a phrase: ");
		String word2 = scnr.nextLine();
		System.out.println(camelClass(word2));
		
		System.out.println();
		System.out.println("Thank for trying, Goodbye.");
		
		scnr.close();
	}
	
	public static String capitalize (String word) {
		
		
		String stringCap = word.substring(0,1);
		stringCap = stringCap.toUpperCase();
		
		String stringLow = word.substring(1);
		stringLow = stringLow.toLowerCase();
		String finalString = stringCap + stringLow;
		
		return finalString;
		
	}
	
	
	public static int wheresWaldo (String phrase) {
		
		int location = phrase.indexOf("waldo");
		return location;
	}
	
	public static String firstThingsFirst(String a , String b) {
		
		int first = a.charAt(0);
		
		int second = b.charAt(0);
		
		if (first > second) {
			
			String print1 = b + " " + a;
			return print1;
		}
		else {
			String print2 = a + " " + b;
			return print2;
		}
	}
	
	public static String reverse (String s) {
		
        StringBuilder userInput = new StringBuilder(s);
        
        String reverseStr = userInput.reverse().toString();
        
        return reverseStr;

	}
	
	public static void soLong(String a , String b) {
		
		int lengthA = a.length();
		int lengthB = b.length();
		
		if (lengthA > lengthB) {
			
			System.out.println("Longer word is: " + a);
		}
		else if ( lengthA == lengthB) {
			
			System.out.println("Both words have equal length: " + a + " " + b);
		}
		else if (lengthB > lengthA) {
			
			System.out.println("Longer word is: " + b);
		}
	}
	
	public static String afterMath(String phrase) {
		
		int indexMath1 = phrase.indexOf("math");
		int indexMath2 = phrase.indexOf("Math");
		
		if (phrase.contains("Math")) {
			
			String output1 = phrase.substring(indexMath2);
			return output1;
		}
		else if (phrase.contains("math")) {
			
			String output2 = phrase.substring(indexMath1);
			
			return output2;

		}
		else {
			
			return "dud.";
		}
	}
	
	public static void letterize(String word) {
		
		int lengthW = word.length();
		
		for (int i = 0; i <= lengthW-1; i++) {
			System.out.println(word.charAt(i));
		}
		
		
	}
	
	public static String camelClass(String word) {
		
			StringBuilder returnPhrase = new StringBuilder();
			
			word = word.toLowerCase();
			boolean camelPhrase = true;
			
			for (char ch : word.toCharArray()) {
				
				if (Character.isSpaceChar(ch) || Character.isWhitespace(ch)) {
					camelPhrase = true;
				}
				else if (camelPhrase) {
					ch = Character.toTitleCase(ch);
					camelPhrase = false;
				}
				
				returnPhrase.append(ch);
				
			}
			return returnPhrase.toString().replaceAll("\\s+", "");
	}
}
