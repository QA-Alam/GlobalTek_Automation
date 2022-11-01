package globaltek.usa.javapractice;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class FindingVowels {
	public static void main(String args[]) {
		getSortTheValue();
		String wordSt = "watch";
		char[] word = wordSt.toCharArray();

		for (int i = 0; i < (word.length - 1); i++) {
			for (int j = i + 1; j > 0; j--) {
				if (word[j] < word[j - 1]) {
					char temp = word[j - 1];
					word[j - 1] = word[j];
					word[j] = temp;
				}
			}
		}
		wordSt = String.valueOf(word);
		//System.out.println(wordSt);
	}

	public static void getSortTheValue() {
		Collator collator = Collator.getInstance(new Locale("fr", "FR"));
		String original = "éDedCBcbAàa";
		String[] split = original.split("");
		Arrays.sort(split, collator);
		String sorted = "";
		for (int i = 0; i < split.length; i++) {
			sorted += split[i];
		}
		System.out.println(sorted); // "aAàbBcCdDeé"
	}

	public void getFindThevowel() {
		String str = new String("Hi Welcome to Tutorialspoint");
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				System.out.println("Given string contains " + str.charAt(i) + " at the index " + i);
			}
		}
	}

}