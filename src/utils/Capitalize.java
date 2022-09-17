package utils;

public class Capitalize {

    private String phrase;

    public Capitalize(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String capitalize() {
		if(this.phrase == null || this.phrase.length() == 0) {
			return this.phrase;
		}
		return this.phrase.substring(0,1).toUpperCase() + this.phrase.substring(1);
	}
}
