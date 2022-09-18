package utils;

public class Capitalize {

    

    public static String capitalize(String phrase) {
		if(phrase == null || phrase.length() == 0) {
			return phrase;
		}
		return phrase.substring(0,1).toUpperCase() + phrase.substring(1);
	}
}
