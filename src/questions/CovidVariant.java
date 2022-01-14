package questions;

public class CovidVariant {
	String code;
	String sequence;
	public CovidVariant(String code, String sequence) {
		super();
		this.code = code;
		this.sequence = sequence;
	}
	public boolean evenSequence() {
		if(this.sequence.length() % 2 == 0) {

			return true;
		}

		return false;
		
	}
	
	public boolean isSubsequence(String s) {
		int index = 0;
		for (int j = 0; j < this.sequence.length(); j++) {
			index = 0;
			for (int i = j; i < this.sequence.length(); i++) {
				if (this.sequence.charAt(i) == s.charAt(index)) {
					if (index == s.length() - 1) {

						return true;
					}
					index += 1;
				}
			}
		}

		return false;
	}
	
	public int longestCommonSubsequence(CovidVariant other) {
		return 0;
		
	}
}
