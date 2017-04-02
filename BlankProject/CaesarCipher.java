import acm.program.*;
public class CaesarCipher extends ConsoleProgram {
	public void run() {
		println("This program uses Caesar's cipher for encryption.");
		int key = readInt("Enter encryption key: ");
		String plainText = readLine("Plaintext: ");
		String cipherText = encryptCaesar(plainText, key);
		println("CipherText " + cipherText);
	}
	
	private String encryptCaesar(String str, int key) {
		if(key < 0) {
			key = 26 - (-key % 26);
		}
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = encryptCharacter(str.charAt(i), key);
			result += ch;
		}
		return result;
	}
	
	private char encryptCharacter(char ch, int key) {
		if(Character.isLetter(ch)) {
			println(Character.toUpperCase(ch) - 'A' + key);
			println((Character.toUpperCase(ch) - 'A' + key) % 26);
			ch = (char) ('A' + (Character.toUpperCase(ch) - 'A' + key) % 26);
		}
		return ch;
	}
}
