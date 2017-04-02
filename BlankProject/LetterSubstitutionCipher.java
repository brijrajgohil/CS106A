import acm.program.*;
public class LetterSubstitutionCipher extends ConsoleProgram {
	public void run() {
		setFont("Courier-26");
		println("This program implements a letter subsitution cipher.");
		String key = readKey();
		String plainText = readLine("PlainText: ");
		String cipherText = encrypt(plainText, key);
		String decryption = decrypt(plainText, key);
		println("CipherText: " + cipherText);
		println("Decryption: " + decryption);
	}
	
	private String readKey() {
		String key = readLine("Enter 26-letter key ");
		while(!isLegalKey(key)) {
			println("Illegal key.");
			key = readLine("Re enter key.");
		}
		return key;
	}
	
	private boolean isLegalKey(String key) {
		if(key.length() != 26) return false;
		for(int i = 0; i < 26; i++) {
			char ch = key.charAt(i);
			if(!Character.isUpperCase(ch)) return false;
			for(int j = i+1; j < 26; j++) {
				if(ch == key.charAt(j)) return false;
			}
		}
		return true;
	}
	
	private String encrypt(String str, String key) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = encryptCharacter(str.charAt(i), key);
			result += ch;
		}
		return result;
	}
	
	private char encryptCharacter(char ch, String key) {
		if(Character.isLetter(ch)) {
			ch = key.charAt(Character.toUpperCase(ch) - 'A');
		}
		return ch;
	}
	
	private String decrypt(String str, String key) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = decryptCharacter(str.charAt(i), key);
			result += ch;
		}
		return result;
	}
	
	private char decryptCharacter(char ch, String key) {
		int index = key.indexOf(ch);
		if(index != -1) {
			ch = (char) ('A' + index);
		}
		return ch;
	}
	
}
